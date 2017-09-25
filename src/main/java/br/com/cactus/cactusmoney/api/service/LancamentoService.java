package br.com.cactus.cactusmoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cactus.cactusmoney.api.exception.PessoaInexistenteOuInativaException;
import br.com.cactus.cactusmoney.api.model.Lancamento;
import br.com.cactus.cactusmoney.api.model.Pessoa;
import br.com.cactus.cactusmoney.api.repository.LancamentoRepository;
import br.com.cactus.cactusmoney.api.repository.PessoaRepository;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if (pessoa == null || !pessoa.getAtivo()) {
			throw new PessoaInexistenteOuInativaException();
		}

		return lancamentoRepository.save(lancamento);
	}

}

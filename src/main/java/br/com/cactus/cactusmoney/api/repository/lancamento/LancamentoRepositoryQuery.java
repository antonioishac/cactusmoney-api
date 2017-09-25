package br.com.cactus.cactusmoney.api.repository.lancamento;

import java.util.List;

import br.com.cactus.cactusmoney.api.model.Lancamento;
import br.com.cactus.cactusmoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}

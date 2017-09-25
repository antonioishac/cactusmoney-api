package br.com.cactus.cactusmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cactus.cactusmoney.api.model.Lancamento;
import br.com.cactus.cactusmoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}

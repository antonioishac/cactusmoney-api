package br.com.cactus.cactusmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cactus.cactusmoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}

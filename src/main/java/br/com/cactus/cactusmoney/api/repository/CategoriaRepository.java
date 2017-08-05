package br.com.cactus.cactusmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cactus.cactusmoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

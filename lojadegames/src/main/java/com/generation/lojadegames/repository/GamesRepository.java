package com.generation.lojadegames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegames.model.Produtos;

public interface GamesRepository extends JpaRepository<Produtos, Long> {
	
	public List <Produtos> findAllByNomeProdutoContainingIgnoreCase(@Param("nomeProduto") String nomeProduto);
}
	
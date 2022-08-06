package com.generation.lojadegames.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegames.Model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long> {

	public List<ProdutoModel> findAllByNomeContainingIgnoreCase (String nome);
	
	public List <ProdutoModel> findByValorBetween(@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);
}

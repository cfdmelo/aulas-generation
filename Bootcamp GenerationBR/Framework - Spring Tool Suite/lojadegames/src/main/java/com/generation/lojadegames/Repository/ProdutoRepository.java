package com.generation.lojadegames.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegames.Modell.ProdutoModell;

public interface ProdutoRepository extends JpaRepository <ProdutoModell, Long> {

	public List<ProdutoModell> findAllByNomeContainingIgnoreCase (String nome);
	
	public List <ProdutoModell> findByValorBetween(@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);
}

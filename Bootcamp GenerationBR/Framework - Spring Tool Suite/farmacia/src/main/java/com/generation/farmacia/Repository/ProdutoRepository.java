package com.generation.farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.Modell.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long> {

	public List <ProdutoModel> findAllByNomeMedicamentoContainingIgnoreCase (String nomeMedcamento);
	
}

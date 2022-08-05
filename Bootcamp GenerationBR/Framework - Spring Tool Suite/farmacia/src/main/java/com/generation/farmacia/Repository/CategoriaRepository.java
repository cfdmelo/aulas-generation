package com.generation.farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.Modell.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel,Long> {

	public List <CategoriaModel> findAllByReferenciaContainingIgnoreCase (String referencia);
}

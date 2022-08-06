package com.generation.lojadegames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojadegames.Model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	
	public List <CategoriaModel> findAllByTipoDispositivoContainingIgnoreCase (String tipoDispositivo);
}

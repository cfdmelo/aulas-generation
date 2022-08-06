package com.generation.lojadegames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojadegames.Modell.CategoriaModell;

public interface CategoriaRepository extends JpaRepository<CategoriaModell, Long> {
	
	public List <CategoriaModell> findAllByTipoDispositivoContainingIgnoreCase (String tipoDispositivo);
}

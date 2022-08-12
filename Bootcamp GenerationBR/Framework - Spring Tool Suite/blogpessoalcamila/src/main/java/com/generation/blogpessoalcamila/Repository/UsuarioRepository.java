package com.generation.blogpessoalcamila.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoalcamila.Model.UsuarioModel;

	@Repository
	public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

		public Optional<UsuarioModel> findByUsuario(String usuario);
}

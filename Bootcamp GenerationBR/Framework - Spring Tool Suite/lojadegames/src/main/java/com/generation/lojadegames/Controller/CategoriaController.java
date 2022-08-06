package com.generation.lojadegames.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojadegames.Modell.CategoriaModell;
import com.generation.lojadegames.Repository.CategoriaRepository;

@RestController
@RequestMapping ("/categoria")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public ResponseEntity<List<CategoriaModell>> GetAll() {
		return ResponseEntity.ok(categoriaRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModell> GetById(@PathVariable Long Id) {
		return categoriaRepository.findById(null).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/tipo/{tipo}")
	public ResponseEntity<List<CategoriaModell>> GetByName(@PathVariable String tipo) {
		return ResponseEntity.ok(categoriaRepository.findAllByTipoDispositivoContainingIgnoreCase(tipo));
	}

	@PostMapping
	public ResponseEntity<CategoriaModell> post(@RequestBody CategoriaModell categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
	}

	@PutMapping
	public ResponseEntity<CategoriaModell> put(@RequestBody CategoriaModell categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		categoriaRepository.deleteById(id);
	}
	
	
}

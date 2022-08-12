package com.generation.blogpessoalcamila.Controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.blogpessoalcamila.Model.TemaModel;
import com.generation.blogpessoalcamila.Repository.TemaRepository;

@RestController
@CrossOrigin(origins = " * ", allowedHeaders = "*")
@RequestMapping("/tema")
public class TemaController {

	@Autowired
	private TemaRepository temaRepository;

	@GetMapping
	public ResponseEntity<List<TemaModel>> getAll() {
		return ResponseEntity.ok(temaRepository.findAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<TemaModel> getById(@PathVariable Long id) {
		return temaRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/descricao{descricao}")
	public ResponseEntity<List<TemaModel>> getByTitle(@PathVariable String descricao) {
		return ResponseEntity.ok(temaRepository.findAllByDescricaoContainingIgnoreCase(descricao));
	}

	@PostMapping
	public ResponseEntity<TemaModel> post(@RequestBody TemaModel temaModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(temaModel));
	}

	@PutMapping
	public ResponseEntity<TemaModel> put(@RequestBody TemaModel temaModel) {
		return ResponseEntity.ok(temaRepository.save(temaModel));
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		Optional<TemaModel> tema = temaRepository.findById(id);
		if (tema.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		temaRepository.deleteById(id);
	}
}

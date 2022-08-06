package com.generation.lojadegames.Controller;

import java.math.BigDecimal;
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
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojadegames.Model.CategoriaModel;
import com.generation.lojadegames.Model.ProdutoModel;
import com.generation.lojadegames.Repository.CategoriaRepository;
import com.generation.lojadegames.Repository.ProdutoRepository;

@RestController
@CrossOrigin (origins = " * ", allowedHeaders = "*")
public class ProdutoContoller {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity <List<ProdutoModel>> GetAll(){
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity <ProdutoModel> GetById(@PathVariable Long Id){
		return produtoRepository.findById(null).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/tipo/{tipo}")
	public ResponseEntity<List<ProdutoModel>> GetByName (@PathVariable String nome){
		return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/preco_incial/{inicio}/preco_final/{fim}")
	public ResponseEntity<List<ProdutoModel>> getByPrecoEntre(@PathVariable BigDecimal inicio, @PathVariable BigDecimal fim){
		return ResponseEntity.ok(produtoRepository.findByValorBetween(inicio, fim));
	}
	
	@PostMapping 
	public ResponseEntity<ProdutoModel> post (@RequestBody ProdutoModel categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity <ProdutoModel> put (@RequestBody ProdutoModel categoria){
		return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(categoria));
	}
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable Long id) {
		produtoRepository.deleteById(id);
	}
	

}

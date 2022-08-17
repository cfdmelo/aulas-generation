package com.generation.blogpessoalcamila.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.blogpessoalcamila.Model.PostagemModel;

@Repository // se comunica com o banco de dados precisa herdar a interface do repositorio JPA para adicionar os métodos padrões (findall etc) e métodos query (insert etc)
public interface PostagemRepository extends JpaRepository<PostagemModel, Long>{ // recebe 2 parâmetros Camada model + tipo da primarykey Estes 2 parâmetros são do tipo Java Generics (podem receber qualquer tipo de Objeto <T, T>). Dentro contexto do JPA são o mínimo necessário para executar os Métodos padrão da Interface Repository, que serão implementados na próxima etapa na Classe PostagemController. Estes Métodos básicos já ficam automaticamente disponíveis no Recurso Postagem a partir do momento que a Interface PostagemRepository herda a Interface JpaRepository.
	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);
	
}

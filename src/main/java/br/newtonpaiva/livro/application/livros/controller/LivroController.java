package br.newtonpaiva.livro.application.livros.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import br.newtonpaiva.livro.api.livros.resource.LivrosResource;
import br.newtonpaiva.livro.api.livros.response.LivroResponse;
import br.newtonpaiva.livro.common.exception.NotFoundException;
import br.newtonpaiva.livro.domain.entity.Livro;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@Validated
public class LivroController implements LivrosResource {
	
	private Map<String, Livro> livros = new HashMap()<String, Livro>();
	
	@Override
	public ResponseEntity<List<LivroResponse>> getAll() {
		log.info("GET cursos");
		

		List<Livro> lista = new ArrayList<Livro>(livros.values());
		

		List<LivroResponse> response = new ArrayList<LivroResponse>();
		

		lista.forEach(curso -> {
			response.add(new LivroResponse(curso));
		});
		

		return ResponseEntity.ok(response);
	}

	@Override
	public ResponseEntity<LivroResponse> getById(Optional<String> id) {
		log.info("GET curso by ID: {}", id);

		Livro livro = livros.get(id.get());
		
		if (livro == null) {
			// retornar HTTP 404
			throw new NotFoundException(id.get());
		}
		
		return ResponseEntity.ok(new LivroResponse(livro));
	}



}

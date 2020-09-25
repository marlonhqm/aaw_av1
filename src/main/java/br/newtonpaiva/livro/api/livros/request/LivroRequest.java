package br.newtonpaiva.livro.api.livros.request;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@AllArgsConstructor
@Data
@With
public class LivroRequest {

	private String id;
	
	@NotBlank
	private String titulo;
	
	@NotBlank
	private String autor;
	
	@NotBlank
	private String editora;
	
	@NotBlank
	private DateTimeFormat dataDePublicacao;
	
	@NotBlank
	private int status;
	
	
	
}

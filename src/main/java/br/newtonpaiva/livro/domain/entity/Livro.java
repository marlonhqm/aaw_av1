package br.newtonpaiva.livro.domain.entity;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@AllArgsConstructor
@Data
@With
public class Livro {
	
	private String id;
	private String titulo;
	private String autor;
	private String editora;
	private DateTimeFormat dataDePublicacao;
	private int status;
}

package br.newtonpaiva.livro.api.livros.response;


import org.springframework.format.annotation.DateTimeFormat;

import br.newtonpaiva.livro.domain.entity.Livro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@AllArgsConstructor
@Data
@With
public class LivroResponse {

	private String id;
	private String titulo;
	private String autor;
	private String editora;
	private DateTimeFormat dataDePublicacao;
	private int status;
	
	public LivroResponse(Livro livro) {
		this.id = livro.getId();
		this.titulo = livro.getTitulo();
		this.autor = livro.getAutor();
		this.editora = livro.getEditora();
		this.dataDePublicacao = livro.getDataDePublicacao();
		this.status = livro.getStatus();
		
	}
	
	
}

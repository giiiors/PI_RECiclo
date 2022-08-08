package com.generation.reciclo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tb_reciclo")
public class TemaModel {
	
	//O import dessa anotation está diferente do exercício anterior
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotBlank(message="Preenchimento Obrigatório")
	@Size(min= 5, max=100, message="Permitido de 05 até 100 caracteres")
	private String titulo;
	
	@NotNull(message="Preenchimento Obrigatório")
	@Size(min= 10, max=500, message="Permitido de 10 até 500 caracteres")
	private String descricao;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

package com.qintess.desafio.cervejaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cidade {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(length = 50)
	private String nome;
	@ManyToOne
	private Estado estado;
	
	public Cidade() {
	}

	public Cidade(String nome, Estado codigo_estado) {
		this.nome = nome;
		this.estado = codigo_estado;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getCodigo_estado() {
		return estado;
	}

	public void setCodigo_estado(Estado codigo_estado) {
		this.estado = codigo_estado;
	}
	
	
	
}

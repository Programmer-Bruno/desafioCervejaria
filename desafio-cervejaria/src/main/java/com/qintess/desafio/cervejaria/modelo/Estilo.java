package com.qintess.desafio.cervejaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estilo {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(length = 50)
	private String nome;
	
	
	public Estilo() {
	}
	
	
	public Estilo(String nome) {
		this.nome = nome;
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

	
	
}

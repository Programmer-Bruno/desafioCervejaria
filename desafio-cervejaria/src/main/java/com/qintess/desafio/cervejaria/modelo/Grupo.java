package com.qintess.desafio.cervejaria.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Grupo {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(length = 50)
	private String nome;
		
	@ManyToMany
	@JoinTable(name = "grupo_permissao",
	joinColumns = @JoinColumn(name = "codigo_grupo"),
	inverseJoinColumns = @JoinColumn(name = "codigo_permissao"))
	private List<Permissao> permissoes  = new ArrayList<Permissao>();
	
	@ManyToMany
	@JoinTable(name = "usuario_grupo",
	joinColumns = @JoinColumn(name = "codigo_usuario"),
	inverseJoinColumns = @JoinColumn(name = "codigo_grupo"))
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	public Grupo() {
	}


	public Grupo(String nome) {
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
	
	public List<Permissao> getPermissoes() {
		return permissoes;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}
}

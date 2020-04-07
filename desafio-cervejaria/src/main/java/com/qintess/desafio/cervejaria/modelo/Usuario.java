package com.qintess.desafio.cervejaria.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(length = 50)
	private String nome;
	@Column(length = 50)
	private String email;
	@Column(length = 120)
	private String senha;
	private int ativo;

	private LocalDate data_nascimento;
	
	@ManyToMany(mappedBy = "usuarios")
	private List<Grupo> grupos = new ArrayList<Grupo>();
	
	

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	public Usuario() {
	}

	public Usuario(String nome, String email, String senha, int ativo, String data_nascimento) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.data_nascimento = LocalDate.parse(data_nascimento, formatter);
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getAtivo() {
		return ativo;
	}
	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	public LocalDate getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public List<Grupo> getGrupos() {
		return grupos;
	}
	
	
}

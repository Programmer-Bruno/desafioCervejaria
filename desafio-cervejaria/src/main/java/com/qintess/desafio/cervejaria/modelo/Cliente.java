package com.qintess.desafio.cervejaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(nullable = true, length = 80)
	private String nome;
	@Column(nullable = true, length = 15)
	private String tipo_pessoa;
	@Column(nullable = true, length = 30)
	private String cpf_cnpj;
	@Column(length = 20)
	private String telefone;
	@Column(nullable = true, length = 50)
	private String email;
	@Column(length = 50)
	private String logradouro;
	@Column(length = 15)
	private String numero;
	@Column(length = 20)
	private String complemento;
	@Column(length = 15)
	private String cep;

	@ManyToOne
	private Cidade cidade;
	
	
	public Cliente() {
	}

	
	public Cliente(String nome, String tipo_pessoa, String cpf_cnpj, String telefone, String email,
			String logradouro, String numero, String complemento, String cep, Cidade cidade) {
		this.nome = nome;
		this.tipo_pessoa = tipo_pessoa;
		this.cpf_cnpj = cpf_cnpj;
		this.telefone = telefone;
		this.email = email;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
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
	public String getTipo_pessoa() {
		return tipo_pessoa;
	}
	public void setTipo_pessoa(String tipo_pessoa) {
		this.tipo_pessoa = tipo_pessoa;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
}

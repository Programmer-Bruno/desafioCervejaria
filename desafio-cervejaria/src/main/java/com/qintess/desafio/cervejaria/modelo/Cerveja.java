package com.qintess.desafio.cervejaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cerveja {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(nullable = true, length = 50)
	private String sku;
	@Column(nullable = true, length = 80)
	private String nome;
	@Column(nullable = true)
	private String descricao;
	@Column(nullable = true, precision = 10, scale = 2)
	private Double valor;
	@Column(nullable = true, precision = 10, scale = 2)
	private Double teor_alcoolico;
	@Column(nullable = true, precision = 10, scale = 2)
	private Double comissao;
	@Column(nullable = true, length = 50)
	private String sabor;
	@Column(nullable = true, length = 50)
	private String origem;

	@ManyToOne
	private Estilo estilo;
	
	private int quantidade_estoque;
	private String foto = null;
	private String content_type = null;
	
	public Cerveja() {
	}

	public Cerveja(String sku, String nome, String descricao, Double valor, Double teor_alcoolico,
			Double comissao, String sabor, String origem, Estilo estilo, int quantidade_estoque) {
		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.teor_alcoolico = teor_alcoolico;
		this.comissao = comissao;
		this.sabor = sabor;
		this.origem = origem;
		this.estilo = estilo;
		this.quantidade_estoque = quantidade_estoque;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getTeor_alcoolico() {
		return teor_alcoolico;
	}

	public void setTeor_alcoolico(Double teor_alcoolico) {
		this.teor_alcoolico = teor_alcoolico;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public int getQuantidadde_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidadde_estoque(int quantidadde_estoque) {
		this.quantidade_estoque = quantidadde_estoque;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}

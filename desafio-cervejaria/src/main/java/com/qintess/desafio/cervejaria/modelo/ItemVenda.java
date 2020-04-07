package com.qintess.desafio.cervejaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemVenda {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	private int quantidade;
	@Column(precision = 10, scale = 2)
	private double valor_unitario;
	
	@ManyToOne
	private Cerveja cerveja;
	@ManyToOne
	private Venda venda;
	
	public ItemVenda() {
	}

	public ItemVenda(int quantidade, Cerveja cerveja, Venda venda) {
		this.quantidade = quantidade;
		this.valor_unitario = cerveja.getValor();
		this.cerveja = cerveja;
		this.venda = venda;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	public Cerveja getCerveja() {
		return cerveja;
	}

	public void setCerveja(Cerveja cerveja) {
		this.cerveja = cerveja;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
}

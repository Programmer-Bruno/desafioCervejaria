package com.qintess.desafio.cervejaria.modelo;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Venda {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	private LocalDateTime data_criacao;
	@Column(precision = 10, scale = 2)
	private double valor_frete;
	@Column(precision = 10, scale = 2)
	private double valor_desconto;
	@Column(precision = 10, scale = 2)
	private double valor_total;
	@Column(length = 30)
	private String status;
	@Column(length = 150)
	private String observacao;
	private LocalDateTime data_hora_entrega;
	
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Usuario usuario;
	
	public Venda() {
	}

	public Venda(double valor_frete, double valor_desconto,
			String status, String observacao, String data_hora_entrega, Cliente cliente, Usuario usuario) {
		this.data_criacao = LocalDateTime.now();
		this.valor_frete = valor_frete;
		this.valor_desconto = valor_desconto;
		this.status = status;
		this.observacao = observacao;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		this.data_hora_entrega = LocalDateTime.parse(data_hora_entrega, formatter);
		this.cliente = cliente;
		this.usuario = usuario;
	}
	
	

	public void setVenda(ItemVenda venda) {
		this.valor_total = ((venda.getValor_unitario() * venda.getQuantidade()) + valor_frete) - valor_desconto;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(LocalDateTime data_criacao) {
		this.data_criacao = data_criacao;
	}

	public double getValor_frete() {
		return valor_frete;
	}

	public void setValor_frete(double valor_frete) {
		this.valor_frete = valor_frete;
	}

	public double getValor_desconto() {
		return valor_desconto;
	}

	public void setValor_desconto(double valor_desconto) {
		this.valor_desconto = valor_desconto;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public LocalDateTime getData_hora_entrega() {
		return data_hora_entrega;
	}

	public void setData_hora_entrega(LocalDateTime data_hora_entrega) {
		this.data_hora_entrega = data_hora_entrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}

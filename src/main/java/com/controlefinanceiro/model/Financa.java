package com.controlefinanceiro.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.NumberFormat;

/**
 * Classe responsavel por representar uma entidade Financas
 * 
 * @author Paulo Henrique Maia Soares
 *
 */
@Entity
public class Financa {

	@Id
	@GeneratedValue
	private Long id;

	private String descricao;

	@Enumerated(EnumType.STRING)
	private TipoFinanca tipo;

	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal valor;

	public Financa() {

	}

	public Financa(Long id, String descricao, TipoFinanca tipo, BigDecimal valor) {
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoFinanca getTipo() {
		return tipo;
	}

	public void setTipo(TipoFinanca tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Financas [id=" + id + ", descricao=" + descricao + ", tipo=" + tipo + ", valor="
				+ valor + "]";
	}

}
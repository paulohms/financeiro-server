package com.controlefinanceiro.model;

/**
 * Classe responsavel por representar um objeto erro
 * 
 * @author Paulo Henrique Maia Soares
 *
 */
public class Erro {

	private String code;
	private String msg;
	
	public Erro(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

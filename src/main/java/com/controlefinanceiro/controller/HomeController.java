package com.controlefinanceiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.controlefinanceiro.model.Erro;
import com.controlefinanceiro.model.Financa;
import com.controlefinanceiro.repository.Financas;

/**
 * Classe responsavel por expor os servicos da aplicacao
 * 
 * @author Paulo Henrique Maia Soares
 *
 */
@RestController
@RequestMapping("/financeiro")
public class HomeController {

	@Autowired
	private Financas financas;
	
	/**
	 * Metodo responsavel por adicionar uma nova financa atraves do metodo POST
	 * @param financa
	 * @return JSON
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> adicionarFinanca(@RequestBody Financa financa) {

		try {
			// seta o id nullo para o hibernate gerar
			financa.setId(null);
			Financa financaResultado = financas.save(financa);
			return new ResponseEntity<Financa>(financaResultado, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Erro>(new Erro("-1", e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Metodo responsavel por atualizar uma financa atraves do metodo PUT
	 * @param financa
	 * @return JSON
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> atualizarFianca(@RequestBody Financa financa) {
		Financa financaResultado = financas.save(financa);
		return new ResponseEntity<Financa>(financaResultado, HttpStatus.OK);
	}

	/**
	 * Metodo responsavel por deletar uma financa atraves do metodo DELETE
	 * @param financa.id
	 * @return JSON
	 */
	@RequestMapping(value="{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletarCurso(@PathVariable("id") Financa financa) {

		try {
			financas.delete(financa);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Erro>(new Erro("-1", e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Metodo responsavel por retornar uma financa atraves do metodo GET
	 * @param financa.id
	 * @return JSON
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Financa listaFinanca(@PathVariable("id") Financa financa) {
		return financa;
	}

	/**
	 * Metodo responsavel por retornar todas as financas cadastradas
	 * @param financa
	 * @return JSON
	 */
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Financa> listaFinancas() {
		
		return financas.findAll();
	}

}

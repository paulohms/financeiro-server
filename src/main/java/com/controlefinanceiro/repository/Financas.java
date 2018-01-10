package com.controlefinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controlefinanceiro.model.Financa;

/**
 * Interface responsavel pela implementacao do JPA
 * 
 * @author Paulo Henrique Maia Soares
 *
 */
public interface Financas extends JpaRepository<Financa, Long> {

}

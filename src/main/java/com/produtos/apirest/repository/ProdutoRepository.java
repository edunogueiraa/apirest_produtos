package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;

//Utilizando esse metodo para utilizar metodos de percistencias com banco
public interface ProdutoRepository extends JpaRepository <Produto, Long> {

}

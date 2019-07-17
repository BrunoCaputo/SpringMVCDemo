package com.bruno.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.bruno.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}

package com.bruno.curso.boot.dao;

import java.util.List;

import com.bruno.curso.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);

	void upadate(Funcionario cargo);

	void delete(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();
}

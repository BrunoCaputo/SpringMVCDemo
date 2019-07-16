package com.bruno.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.bruno.curso.boot.domain.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {

	@Override
	public void upadate(Departamento departamento) {
		
	}
}

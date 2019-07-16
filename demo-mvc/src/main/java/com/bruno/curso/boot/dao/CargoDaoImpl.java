package com.bruno.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.bruno.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

	@Override
	public void upadate(Cargo cargo) {
		
	}
}

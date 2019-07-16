package com.bruno.curso.boot.dao;

import java.util.List;

import com.bruno.curso.boot.domain.Cargo;

public interface CargoDao {

	void save(Cargo cargo);

	void upadate(Cargo cargo);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
}

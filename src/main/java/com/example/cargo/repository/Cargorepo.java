package com.example.cargo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cargo.model.Cargoqoute;


@Repository
public interface Cargorepo extends JpaRepository<Cargoqoute, Long>{

}

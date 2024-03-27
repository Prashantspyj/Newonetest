package com.example.cargo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cargo.model.Cargoqoute;
import com.example.cargo.repository.Cargorepo;
import com.example.cargo.service.Cargoqouteservice;

@Service
public class Cargoqouteserviceimp implements Cargoqouteservice{

	@Autowired 
	private Cargorepo cargorepo;
	
	@Override
	public List<Cargoqoute> getallqoute() {
		// TODO Auto-generated method stub
		return cargorepo.findAll();
	}

}

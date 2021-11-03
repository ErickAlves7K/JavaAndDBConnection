package com.javaanddatabase.connection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaanddatabase.connection.beans.Lanches;
import com.javaanddatabase.connection.dao.LanchesDAO;

@RestController
public class LanchesController {

	@Autowired
	private LanchesDAO dao;
	
	@GetMapping("/Lanches")
	public ResponseEntity<List<Lanches>> getAll() {
		List<Lanches> list = (List<Lanches>)dao.findAll();
		return ResponseEntity.ok(list);
	}
}

package com.generation.reciclo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.reciclo.model.PostagemModel;
import com.generation.reciclo.model.TemaModel;
import com.generation.reciclo.repository.PostagemRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/postagem")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PostagemModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	
	

}

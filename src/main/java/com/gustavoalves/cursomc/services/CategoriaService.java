package com.gustavoalves.cursomc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gustavoalves.cursomc.resources.domain.Categoria;

@Service
public class CategoriaService {

	public Categoria buscar() {
		
		public Categoria find(Integer id) { 
			Optional<Categoria> obj = repo.findById(id); 
			return obj.orElse(null); } 
	}

}

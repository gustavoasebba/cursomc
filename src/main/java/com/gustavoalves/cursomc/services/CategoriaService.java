package com.gustavoalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavoalves.cursomc.repositories.CategoriaRepository;
import com.gustavoalves.cursomc.resources.domain.Categoria;

@Service
public class CategoriaService {
	
	public Categoria buscar() {
		
		@Autowired
		private CategoriaRepository repo;
		
		public Categoria buscar(Integer id) {
			Categoria obj = repo.findOne(id);
		}
		
	}

}

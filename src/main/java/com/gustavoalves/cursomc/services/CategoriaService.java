package com.gustavoalves.cursomc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gustavoalves.cursomc.resources.domain.Categoria;
import com.gustavoalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	public Categoria find(Integer id) { 
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(   
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())); 
	}

}

package com.gustavoalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavoalves.cursomc.resources.domain.Categoria;

@Repository
public interface ProdutoRepository extends JpaRepository<Categoria, Integer> {

}

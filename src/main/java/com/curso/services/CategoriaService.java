package com.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.domain.Categoria;
import com.curso.repositories.CategoriaRepository;
import com.curso.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		//a versao 2.x do spring atualizou a implementacao sendo requerido um Optional como retorno.
		Optional<Categoria> opt = repo.findById(id);
		
		// ou retorna um Optional instanciado ou um objeto da nossa escolha. Neste caso retornei uma excecao.
		return opt.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"
				+ " id:" + id + " , Tipo: " + Categoria.class.getName()));
	}
	
}

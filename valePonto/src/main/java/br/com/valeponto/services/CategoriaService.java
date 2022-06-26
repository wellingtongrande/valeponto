package br.com.valeponto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.valeponto.domain.Categoria;
import br.com.valeponto.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repro;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repro.findById(id);
		return obj.orElse(null);
	}
	
}

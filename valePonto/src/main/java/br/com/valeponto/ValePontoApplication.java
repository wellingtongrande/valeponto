package br.com.valeponto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.valeponto.domain.Categoria;
import br.com.valeponto.repositories.CategoriaRepository;

@SpringBootApplication
public class ValePontoApplication implements  CommandLineRunner {

	@Autowired
	protected CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ValePontoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria categoria1  = new Categoria(null, "Alimentos");
		Categoria categoria2  = new Categoria(null, "Beleza");
		
		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
		
	}

}

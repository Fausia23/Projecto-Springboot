package com.fausiahleco.aplicacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fausiahleco.model.Dados;
import com.fausiahleco.service.ConsumoApi;
import com.fausiahleco.service.ConverterDados;



@SpringBootApplication
public class AplicacaoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var  consumoApi = new ConsumoApi();
		var json= consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		
		// json=consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		// System.out.println(json);


		ConverterDados conversor = new ConverterDados();
		Dados dados=conversor.obterDados(json, Dados.class);
		System.out.println(dados);
	}
		

}

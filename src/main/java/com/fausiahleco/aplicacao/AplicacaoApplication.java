package com.fausiahleco.aplicacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import com.fausiahleco.model.Dados;
// import com.fausiahleco.model.DadosEpisodio;
// import com.fausiahleco.model.DadosTemporada;
// import com.fausiahleco.service.ConsumoApi;
// import com.fausiahleco.service.ConverterDados;
// import com.fausiahleco.service.ConvertDados;
import com.fausiahleco.principal.Principal;






 @SpringBootApplication
 public class AplicacaoApplication implements CommandLineRunner {

 	public static void main(String[] args) {
 		SpringApplication.run(AplicacaoApplication.class, args);
 	}

	@Override
public void run(String... args) throws Exception {

	Principal principal = new Principal();
		principal.exibirMenu();

// 		Exemplo de uso do consumoApi e conversor
// 		var consumoApi = new ConsumoApi();
// 		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
// 		System.out.println(json);

// 		ConverterDados conversor = new ConverterDados();
// 		Dados dados = conversor.obterDados(json, Dados.class);
// 		System.out.println(dados);

// 		var  consumoApi = new ConsumoApi();
// 		var json= consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
// 		System.out.println(json);

// 		// json=consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
// 		// System.out.println(json);


// 		ConverterDados conversor = new ConverterDados();
// 		Dados dados=conversor.obterDados(json, Dados.class);
// 		System.out.println(dados);

		
// 		var jsonEpisodio = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=6585022c");
// 		DadosEpisodio dadosEpisodio=conversor.obterDados(jsonEpisodio, DadosEpisodio.class);
// 		System.out.println(dadosEpisodio);
    

// List<DadosTemporada> temporadas=new ArrayList<>();




// 		for (int i = 1; i <= dados.temporadas(); i++) {
// 			var jsonEpisodio1 = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" +i+ "&apikey=6585022c");
// 			DadosTemporada dadosTemporada=conversor.obterDados(jsonEpisodio1, DadosTemporada.class);
			
//        temporadas.add(dadosTemporada);

// 	}
// 		 System.out.println("\n--- Todas as Temporadas ---");
//         temporadas.forEach(System.out::println);

				
	}
}

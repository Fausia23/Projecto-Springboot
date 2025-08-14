package com.fausiahleco.principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fausiahleco.model.Dados;
import com.fausiahleco.model.DadosTemporada;
import com.fausiahleco.service.ConsumoApi;
import com.fausiahleco.service.ConverterDados;




public class Principal {
private Scanner leitura=new Scanner(System.in);
private final String API_KEY="&apikey=6585022c";
private final String ENDERECO="https://www.omdbapi.com/?t=";

 ConsumoApi consumoApi = new ConsumoApi();
 private ConverterDados conversor = new ConverterDados();




  public void exibirMenu(){
    System.out.println("Digite o nome da série que deseja pesquisar:");
    var nomeSerie=leitura.nextLine(); 
   ;
		var json= consumoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+")+ API_KEY);
    
System.out.println("JSON recebido da API: " + json);

    if (json == null || json.isEmpty()) {
      System.out.println("Nenhum dado encontrado para a série: " + nomeSerie);
      return;
    }

    // Converter o JSON recebido em um objeto Dados
    // Aqui você pode usar o conversor que você já implementou
		ConverterDados conversor = new ConverterDados();
		Dados dados=conversor.obterDados(json, Dados.class);

    // ENDERECO + nomeSerie.replace(" ", "+") + API_KEY;
    //"https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c"
System.out.println(dados);
 List<DadosTemporada> temporadas=new ArrayList<>();




		for (int i = 1; i <= dados.temporadas(); i++) {
			var jsonEpisodio1 = consumoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+")+"&season="+i+ API_KEY);
			DadosTemporada dadosTemporada=conversor.obterDados(jsonEpisodio1, DadosTemporada.class);
			
       temporadas.add(dadosTemporada);

	}
		 System.out.println("\n--- Todas as Temporadas ---");
        temporadas.forEach(System.out::println);

    // Aqui você pode adicionar mais lógica para exibir detalhes adicionais ou interagir com o usuário

  }

}

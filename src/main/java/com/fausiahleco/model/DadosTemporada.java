package com.fausiahleco.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada( @JsonAlias("Seasons") Integer numero,
                             @JsonAlias("Episodes")  List<DadosEpisodio> episodios
                             


) {

}

package com.fausiahleco.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record Dados(@JsonAlias("Title") String titulo,
                    @JsonAlias("totalSeasons") Integer temporadas,
                    @JsonAlias("imdbRating") String avaliacao) {

}
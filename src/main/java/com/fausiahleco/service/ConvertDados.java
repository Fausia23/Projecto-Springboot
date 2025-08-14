package com.fausiahleco.service;

public interface ConvertDados {
  <T> T obterDados(String json, Class<T> classe) ;

}

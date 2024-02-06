package br.com.dio.reactiveflashCard.api.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record UserRequest(@JsonIgnoreProperties("nome") String nome,
                          @JsonIgnoreProperties("email") String email) {
}

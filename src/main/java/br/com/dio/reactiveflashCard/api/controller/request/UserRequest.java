package br.com.dio.reactiveflashCard.api.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record UserRequest(@JsonIgnoreProperties("name") String name,
                          @JsonIgnoreProperties("email") String email) {
}

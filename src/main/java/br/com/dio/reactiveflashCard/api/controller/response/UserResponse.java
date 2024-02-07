package br.com.dio.reactiveflashCard.api.controller.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record UserResponse(@JsonIgnoreProperties("id") String id,
                           @JsonIgnoreProperties("name") String name,
                           @JsonIgnoreProperties("email") String email) {
}

package br.com.dio.reactiveflashCard.core.validation.domain.document;

import lombok.Builder;

public record Question(String asked,
                       String answered,
                       String expected) {
    @Builder(toBuilder = true)
    public Question {}

}

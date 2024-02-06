package br.com.dio.reactiveflashCard.domain.document;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.OffsetDateTime;

//sendo esse card uma coleção especifica dentro do deckDocument, sendo ele nao vai ser persistido, VAI SEr UM ATRIBUTO MEIO Q INTERNO, POR ISSO O NOME DIFERENTE
public record Card(String front, String back) {
}

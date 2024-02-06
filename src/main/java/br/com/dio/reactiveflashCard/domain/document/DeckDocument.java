package br.com.dio.reactiveflashCard.domain.document;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.OffsetDateTime;
import java.util.Set;

@Document(collection = "decks")
public record DeckDocument(
        @Id
        String id,
        String name,
        String descricao,
        Set<Card> cards,
        @CreatedDate
        @Field("create_at")
        OffsetDateTime createdAt,
        @LastModifiedDate
        @Field("update_at")
        OffsetDateTime updateAt) {

}

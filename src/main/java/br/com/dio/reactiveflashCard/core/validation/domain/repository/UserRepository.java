package br.com.dio.reactiveflashCard.core.validation.domain.repository;

import br.com.dio.reactiveflashCard.core.validation.domain.document.UserDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends ReactiveMongoRepository<UserDocument, String> {
}

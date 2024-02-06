package br.com.dio.reactiveflashCard.api.controller.response;

import br.com.dio.reactiveflashCard.api.controller.request.UserRequest;
import br.com.dio.reactiveflashCard.domain.document.UserDocument;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDocument toDocument(final UserRequest request);

    UserDocument toResponse(final UserDocument document);
}

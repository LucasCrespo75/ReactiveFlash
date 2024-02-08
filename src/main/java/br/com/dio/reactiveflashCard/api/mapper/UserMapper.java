package br.com.dio.reactiveflashCard.api.mapper;

import br.com.dio.reactiveflashCard.api.controller.request.UserRequest;
import br.com.dio.reactiveflashCard.api.controller.response.UserResponse;
import br.com.dio.reactiveflashCard.core.validation.domain.document.UserDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    UserDocument toDocument(final UserRequest request);


    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    UserDocument toDocument(final UserRequest request, final String id);


    UserResponse toResponse(final UserDocument document);



}

package br.com.dio.reactiveflashCard.api.controller;


import br.com.dio.reactiveflashCard.api.mapper.UserMapper;
import br.com.dio.reactiveflashCard.api.controller.request.UserRequest;
import br.com.dio.reactiveflashCard.api.controller.response.UserResponse;
import br.com.dio.reactiveflashCard.core.validation.domain.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@Slf4j
@Validated
@RestController
@RequestMapping("usuarios")

public class UserController {

    final UserService userService;
    final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }


    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<UserResponse> criar(@Valid @RequestBody final UserRequest request) {
        return userService.salvar(userMapper.toDocument(request))
                .doFirst(() -> log.info("SAVING THE DATA {}", request))
                .map(userMapper::toResponse);
    }
}
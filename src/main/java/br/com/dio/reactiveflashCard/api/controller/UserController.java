package br.com.dio.reactiveflashCard.api.controller;


import br.com.dio.reactiveflashCard.api.controller.mapper.UserMapper;
import br.com.dio.reactiveflashCard.api.controller.request.UserRequest;
import br.com.dio.reactiveflashCard.domain.document.UserDocument;
import br.com.dio.reactiveflashCard.domain.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@Slf4j
@Validated
@RestController
@RequestMapping("usuarios")
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Mono<UserDocument>> criando(@Valid @RequestBody final UserRequest request) {
        log.info("SAVING THE DATA {}", request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.salvar(userMapper.toDocument(request)).map(userMapper::toResponse));
    }
}
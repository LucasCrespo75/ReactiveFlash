package br.com.dio.reactiveflashCard.core.validation.domain.service;


import br.com.dio.reactiveflashCard.core.validation.domain.document.UserDocument;
import br.com.dio.reactiveflashCard.core.validation.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@AllArgsConstructor
@Service
public class UserService {

     private final UserRepository userRepository;


     public Mono<UserDocument> salvar(final UserDocument userDocument){
         return userRepository.save(userDocument)
                 .doFirst(() -> log.info("execute this {} before everything"));
     }

}

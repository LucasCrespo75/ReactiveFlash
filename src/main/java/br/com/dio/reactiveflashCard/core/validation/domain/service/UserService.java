package br.com.dio.reactiveflashCard.core.validation.domain.service;


import br.com.dio.reactiveflashCard.core.validation.domain.document.UserDocument;
import br.com.dio.reactiveflashCard.core.validation.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public Mono<UserDocument> salvar(final UserDocument userDocument){
         return userRepository.save(userDocument)
                 .doFirst(() -> log.info("execute this {} before everything"));
     }

}

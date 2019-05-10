package co.com.sofka.saludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SaludoController {

    @GetMapping(value = "/saludo")
    public Mono<String> saludo(){
        return Mono.just("Farid Rico");
    }
}

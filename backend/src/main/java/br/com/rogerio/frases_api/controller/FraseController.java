package br.com.rogerio.frases_api.controller;

import br.com.rogerio.frases_api.model.Frase;
import br.com.rogerio.frases_api.service.FraseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    private final FraseService fraseService;

    public FraseController(FraseService fraseService) {
        this.fraseService = fraseService;
    }

    @GetMapping("/frasedodia")
    public Frase fraseDoDia() {
        return fraseService.buscarFrase();
    }


}

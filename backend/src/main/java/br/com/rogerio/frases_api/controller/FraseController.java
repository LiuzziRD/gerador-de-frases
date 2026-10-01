package br.com.rogerio.frases_api.controller;

import br.com.rogerio.frases_api.service.FraseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    FraseService fraseService = new FraseService();

    @GetMapping("/frasedodia")
    public String fraseDoDia() {
        return fraseService.buscarFrase();
    }


}

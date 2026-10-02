package br.com.rogerio.frases_api.service;

import br.com.rogerio.frases_api.model.Frase;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class FraseService {

    public Frase buscarFrase() {

        URI fraseDia = URI.create("https://www.fraseestoica.com.br/api");
        HttpClient client = HttpClient.newHttpClient();
        final var objectMapper = new ObjectMapper();


        HttpRequest request = HttpRequest.newBuilder()
                .uri(fraseDia)
                .build();

        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString()
            );


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao consultar a API!");
        }

        return objectMapper.readValue( response.body(), Frase.class);
    }


}

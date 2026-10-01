package br.com.rogerio.frases_api.service;

import br.com.rogerio.frases_api.model.Frase;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FraseService {

    public String buscarFrase() {

        URI fraseDia = URI.create("https://www.fraseestoica.com.br/api");
        HttpClient client = HttpClient.newHttpClient();


        HttpRequest request = HttpRequest.newBuilder()
                .uri(fraseDia)
                .build();

        try {
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );
            return response.body();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao consultar a API!");
        }
    }


}

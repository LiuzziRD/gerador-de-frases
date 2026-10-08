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

    URI fraseDia = URI.create("https://www.fraseestoica.com.br/api");



    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public FraseService(HttpClient httpClient, ObjectMapper objectMapper) {
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }


    public Frase buscarFrase() {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(fraseDia)
                .build();

        HttpResponse<String> response = null;

        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString()
            );


            int status = response.statusCode();
            if (status == 200) {

                return objectMapper.readValue( response.body(), Frase.class);


            }else if (status >=400 && status < 500) {
                throw new RuntimeException("Erro na requisição. Status: " + status);

            }else  if (status >= 500 && status < 600) {
                throw new RuntimeException("Erro no servidor da API. Status: " + status);
            }else{
                throw new RuntimeException("Status HTTP inesperado: " + status);
            }

        } catch (IOException e) {
            throw new RuntimeException("Não consegui realizar a comunicação com a API.", e);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            throw new RuntimeException("A requisição foi interrompida.", e);
        }


    }


}

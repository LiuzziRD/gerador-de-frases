package br.com.rogerio.frases_api.config;


import org.springframework.context.annotation.Bean;
import tools.jackson.databind.ObjectMapper;


import java.net.http.HttpClient;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public HttpClient httpClient() {
        return HttpClient.newHttpClient();
    }


    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}

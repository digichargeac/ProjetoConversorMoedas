package src.service;

import com.google.gson.Gson;
import src.model.ConversionResponse;
import src.util.HttpClientProvider;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyService {

    private static final String API_KEY = "c458a4a9efeb4e2708bc0813";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    private final Gson gson = new Gson();

    public double performConversion(String from, String to, double amount) {

        String url = BASE_URL + API_KEY + "/pair/" + from + "/" + to;

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    HttpClientProvider.getClient().send(request, HttpResponse.BodyHandlers.ofString());

            ConversionResponse conversion = gson.fromJson(response.body(), ConversionResponse.class);

            if (conversion == null || conversion.conversion_rate() == 0) {
                throw new RuntimeException("Erro ao obter taxa de conversão.");
            }

            return amount * conversion.conversion_rate();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Falha ao consultar API: " + e.getMessage());
        }
    }
}

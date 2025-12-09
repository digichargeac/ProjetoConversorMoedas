package src.util;

import java.net.http.HttpClient;

public class HttpClientProvider {

    private static HttpClient client;

    private HttpClientProvider() {}

    public static HttpClient getClient() {
        if (client == null) {
            client = HttpClient.newHttpClient();
        }
        return client;
    }
}

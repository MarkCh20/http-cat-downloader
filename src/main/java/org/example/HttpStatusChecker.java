package org.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {

    public String getStatusImage(int code) throws IOException {
        String urlString = "https://http.cat/" + code + ".jpg";
        URL url = new URL(urlString);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        connection.disconnect();

        if (responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
            throw new IOException("Image not found for HTTP status code: " + code);
        }

        return urlString;
    }
}

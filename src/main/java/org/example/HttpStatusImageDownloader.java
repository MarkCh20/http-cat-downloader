package org.example;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class HttpStatusImageDownloader {

    private final HttpStatusChecker checker = new HttpStatusChecker();

    public void downloadStatusImage(int code) throws IOException {
        String imageUrl = checker.getStatusImage(code);
        URL url = new URL(imageUrl);

        try (InputStream in = new BufferedInputStream(url.openStream());
             FileOutputStream out = new FileOutputStream(code + ".jpg")) {

            byte[] buffer = new byte[1024];
            int count;
            while ((count = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, count);
            }
        }
        System.out.println("Image downloaded successfully as " + code + ".jpg");
    }
}

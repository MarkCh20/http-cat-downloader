package org.example;

import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {

    private final HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();

    public void askStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code:");

        String input = scanner.nextLine();

        int code;
        try {
            code = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
            return;
        }

        try {
            downloader.downloadStatusImage(code);
            System.out.println("Download completed successfully.");
        } catch (IOException e) {
            System.out.println("There is no image for HTTP status " + code);
        }
    }
}

package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HttpImageStatusCli {

    private final HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();

    public void askStatus() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter HTTP status code:");

            int code;
            try {
                code = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            try {
                downloader.downloadStatusImage(code);
                System.out.println("Download completed successfully.");
                break;
            } catch (IOException e) {
                System.out.println("There is no image for HTTP status " + code);
            }
        }
    }
}

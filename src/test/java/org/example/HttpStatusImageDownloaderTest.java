package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HttpStatusImageDownloaderTest {

    private HttpStatusImageDownloader imageDownloader;

    @BeforeEach
    void setup() {
        // Initialize the object before each test case
        imageDownloader = new HttpStatusImageDownloader();
    }

    @Test
    void givenValidStatusCode_whenDownloadStatusImage_thenDownloadImageSuccessfully() {
        // Given a valid status code
        int statusCode = 200;

        // When we call downloadStatusImage with the status code
        // Then we expect no exception to be thrown
        assertDoesNotThrow(() -> imageDownloader.downloadStatusImage(statusCode));
    }

    @Test
    void givenInvalidStatusCode_whenDownloadStatusImage_thenThrowIOException() {
        // Given an invalid status code
        int statusCode = 10000;

        // When we call downloadStatusImage with the invalid status code
        // Then we expect an IOException to be thrown
        assertThrows(IOException.class, () -> imageDownloader.downloadStatusImage(statusCode));
    }
}

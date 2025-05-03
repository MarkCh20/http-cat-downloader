package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HttpStatusCheckerTest {

    private HttpStatusChecker statusChecker;

    @BeforeEach
    void setup() {
        // Initialize the object before each test case
        statusChecker = new HttpStatusChecker();
    }

    @Test
    void givenValidStatusCode_whenGetStatusImage_thenReturnCorrectImageUrl() throws IOException {
        // Given a valid status code
        int statusCode = 200;

        // When we call getStatusImage with the status code
        String actualImageUrl = statusChecker.getStatusImage(statusCode);

        // Then we expect the URL to be correct
        String expectedImageUrl = "https://http.cat/200.jpg";
        assertEquals(expectedImageUrl, actualImageUrl);
    }

    @Test
    void givenInvalidStatusCode_whenGetStatusImage_thenThrowIOException() {
        // Given an invalid status code
        int statusCode = 10000;

        // When we call getStatusImage with the invalid status code
        // Then we expect an IOException to be thrown
        assertThrows(IOException.class, () -> statusChecker.getStatusImage(statusCode));
    }
}

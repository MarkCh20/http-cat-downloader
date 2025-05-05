# Http Cat Image Downloader

This project allows users to download a cat image corresponding to an HTTP status code from the website https://http.cat.

## Table of Contents

1. [Introduction](#introduction)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Functional](#functional)

## Introduction
This project interacts with the https://http.cat website and consists of the following tasks:

- Getting an image link for a given HTTP status code: The project provides functionality to retrieve a cat image URL based on an HTTP status code.

- Downloading the image: It allows users to download the image corresponding to the provided status code and save it locally.

- Command-line interface: A CLI is available for users to input an HTTP status code, check the availability of the image, and download it if available.

- Error handling: The project handles cases where an invalid HTTP status code is entered or when no image exists for a given code.

These tasks demonstrate HTTP requests, file handling, error handling, and interaction with web resources in Java.

## Features
- Retrieve an image link for a given HTTP status code (HttpStatusChecker).

- Download an image for a specific HTTP status code (HttpStatusImageDownloader).

- Command-line interface to input a status code and download the corresponding image (HttpImageStatusCli).

- Exception handling for invalid status codes and invalid user input.

- Unit tests for core functionality.

## Technologies Used
- Java 17+

- Maven

- Standard Java Libraries:

  - HttpURLConnection for sending HTTP requests

  - Scanner for user input

  - InputStream for reading the image

  - FileOutputStream for saving the image to a file

  - JUnit 5

## Functional
- Getting an image URL by status code: The HttpStatusChecker class provides a method to get the URL of the cat image for a given HTTP status code.

- Downloading the image for a status code: The HttpStatusImageDownloader class downloads the image corresponding to the provided status code and saves it locally.

- Command-line interface: The HttpImageStatusCli class allows users to input an HTTP status code through the console. If a valid code is entered, the image is downloaded; otherwise, an appropriate error message is displayed.

- Error handling: The program handles incorrect status codes (e.g., when an image for a code is unavailable) and invalid user inputs (non-numeric input or invalid codes).

- Unit tests: Unit tests are provided to ensure that the main functionalities of the application work correctly.




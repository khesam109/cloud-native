package com.khesam.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @RestController} Identifies a class defining handlers for REST/HTTP endpoints
 * which  handle incoming HTTP requests.
 */
@RestController
public class HomeController {

    /**
     * Handles GET requests to the root endpoint
     */
    @GetMapping("/")
    public String getGreeting() {
        return "Welcome to the book catalog!";
    }
}

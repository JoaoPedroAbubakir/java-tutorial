package com.abubakir.aulaadler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is just the entry point of the code.
 * Optimally, no code should be here other than some REALLY specific things
 * that depend on some triggers like "before application starts" or "right after it starts"
 */
@SpringBootApplication
public class AulaAdlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AulaAdlerApplication.class, args);
    }

}

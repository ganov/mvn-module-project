package com.ganov.sandbox.webapp;

import com.ganov.sandbox.service.EvenOddService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication(scanBasePackages = "com.ganov")
@RestController
public class EvenOddApplication {

    private EvenOddService evenOddService;

    public EvenOddApplication(EvenOddService evenOddService) {
        this.evenOddService = evenOddService;
    }

    @GetMapping("/validate/")
    public String isEvenOrOdd(
            @RequestParam("number") Integer number) {
        return evenOddService.isEvenOrOdd(number);
    }

    public static void main(String[] args) {
        SpringApplication.run(EvenOddApplication.class, args);
    }
}

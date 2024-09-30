package com.example.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String dategets() {
    LocalDate ld= LocalDate.now();
    DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String p=ld.format(df);
    return p;
    }
}

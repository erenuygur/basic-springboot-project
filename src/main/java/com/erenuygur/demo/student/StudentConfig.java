package com.erenuygur.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student eren = new Student("Eren", "erenuygur@gmail.com", LocalDate.of(1999, Month.SEPTEMBER, 9), 23);
            Student mehmet = new Student("Mehmet", "mehmet123@gmail.com", LocalDate.of(1993, Month.MARCH, 3), 30);

            repository.saveAll(List.of(eren, mehmet));
        };
    }
}

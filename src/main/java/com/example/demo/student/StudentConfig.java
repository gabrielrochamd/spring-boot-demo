package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student gabriel = new Student(
                    1L,
                    "Gabriel",
                    "gabriel@example.com",
                    LocalDate.of(1998, Month.DECEMBER, 23)
            );

            Student alex = new Student(
                    2L,
                    "Alex",
                    "alex@example.com",
                    LocalDate.of(2000, Month.JANUARY, 1)
            );

            studentRepository.saveAll(Arrays.asList(gabriel, alex));
        };
    }
}

package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student subhan = new Student(
                    1L,
                    "Subhan",
                    "subhan@subhan.com",
                    LocalDate.of(2000,11,11)
            );

            Student alex = new Student(
                    "Alex",
                    "Alex@subhan.com",
                    LocalDate.of(2000,12,11)
            );

            studentRepository.saveAll(
                    List.of(subhan, alex)
            );
        };
    }
}

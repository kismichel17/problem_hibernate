package ru.kismi.problemhibernate;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kismi.problemhibernate.service.ProblemHibernateService;

@SpringBootApplication
@RequiredArgsConstructor
public class ProblemHibernateApplication implements CommandLineRunner {

    private final ProblemHibernateService hibernateService;

    public static void main(String[] args) {
        SpringApplication.run(ProblemHibernateApplication.class, args);
    }

    @Override
    public void run(String... args) {
        hibernateService.test6();
    }
}
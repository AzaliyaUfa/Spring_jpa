package ru.ibs.internship.spring.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ibs.internship.spring.jpa.entity.Car;
import ru.ibs.internship.spring.jpa.repositories.CarRepository;


public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        System.out.println("Завершилось?");


    }
}

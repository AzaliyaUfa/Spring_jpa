package ru.ibs.internship.spring.appCont.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnot {

    public static void main(String[] args) {

        ApplicationContext appContAnnot = new ClassPathXmlApplicationContext("annotation-application-context.xml");


    }
}

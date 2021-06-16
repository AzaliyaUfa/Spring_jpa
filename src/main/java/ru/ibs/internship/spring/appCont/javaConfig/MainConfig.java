package ru.ibs.internship.spring.appCont.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConfig {

    public static void main(String[] args) {

        ApplicationContext appContXml = new ClassPathXmlApplicationContext("config-application-context.xml");


    }
}

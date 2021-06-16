package ru.ibs.internship.spring.appCont.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXml {

    public static void main(String[] args) {

        ApplicationContext appContXml = new ClassPathXmlApplicationContext("xml-application-context.xml");


    }
}

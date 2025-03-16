package com.saha.merlin.presentation;

import com.saha.merlin.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("config.xml");

        //IMetier metier = (IMetier) applicationContext.getBean("metier");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Result= "+metier.calcul());
    }
}

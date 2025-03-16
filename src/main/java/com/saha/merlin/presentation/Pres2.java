package com.saha.merlin.presentation;

import com.saha.merlin.dao.IDao;
import com.saha.merlin.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

//        IMetier metier = (IMetier) cMetier.getConstructor().newInstance(); // Instantiation avec constructeur sans paramettre
//        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
//        setDao.invoke(metier, dao); // Instantiation dynamique ou par reflexion

        System.out.println(metier.calcul());
    }
}

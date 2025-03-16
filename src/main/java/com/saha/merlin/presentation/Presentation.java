package com.saha.merlin.presentation;

import com.saha.merlin.ext.DaoImplV2;
import com.saha.merlin.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImplV2 daoImpl = new DaoImplV2();
        MetierImpl metier = new MetierImpl(daoImpl); // Injection des dependances via le constructeur

        //metier.setDao(daoImpl); // Injection des dependances via le setter
        System.out.println("Resutat= "+metier.calcul());
    }
}

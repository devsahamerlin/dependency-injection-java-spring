package com.saha.merlin.dao;

public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        return 34;
    }
}

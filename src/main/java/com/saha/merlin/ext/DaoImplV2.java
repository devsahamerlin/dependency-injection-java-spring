package com.saha.merlin.ext;

import com.saha.merlin.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs ...");
        return 12;
    }
}

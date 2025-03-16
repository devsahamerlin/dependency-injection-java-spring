package com.saha.merlin.ext;

import com.saha.merlin.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs ...");
        return 12;
    }
}

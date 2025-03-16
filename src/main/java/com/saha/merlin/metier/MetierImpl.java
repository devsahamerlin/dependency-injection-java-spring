package com.saha.merlin.metier;

import com.saha.merlin.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao iDao; // Couplage faible

    /**
     * Injecte dans l'attribut IDao
     * un objet d'une classe qui implémente l'interface IDao
     * au moment de l'instanciation.
     *
     * L'injection par le constructeur est recommandée, car elle est plus rapide et optimisée, garanti que l'objet est complet et bien configuré dès sa création.
     */

    public IMetierImpl(IDao dao) {
        iDao = dao;
    }

    public IMetierImpl() {}

    @Override
    public double calcul() {
        double temperature = iDao.getData();
        return temperature * 12 * Math.PI / 2 * Math.cos(temperature);
    }

    /**
     * Injecte dans l'attribut IDao
     * un objet d'une classe qui implémente l'interface IDao
     * après l'instantiation.
     *
     * L'injection par le setter est parfois utilisée pour des cas spécifiques où l'on souhaite une plus grande flexibilité, mais avec plus de risques.
     */

    public void setDao(IDao dao) {
        iDao = dao;
    }
}

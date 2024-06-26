package io.github.admgk.indicator;

import io.github.admgk.HibernateUtil;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.TreeMap;

public class AnnualInflationRepository {
    List<? extends Indicator> findAll() {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        var result = session.createQuery("FROM AnnualInflation", AnnualInflation.class).list();

        transaction.commit();
        session.close();

        return result;
    }
}

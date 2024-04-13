package io.github.admgk.indicator;

import io.github.admgk.HibernateUtil;

import java.util.List;

public class AverageSalaryRepository {
    List<? extends Indicator> findAll() {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        var result = session.createQuery("FROM AverageSalary", AverageSalary.class).list();

        transaction.commit();
        session.close();

        return result;
    }
}

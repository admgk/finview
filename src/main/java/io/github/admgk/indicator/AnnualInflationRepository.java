package io.github.admgk.indicator;

import io.github.admgk.HibernateUtil;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.TreeMap;

public class AnnualInflationRepository {
    IndicatorDTO findAll() {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        var result = session.createQuery("FROM annual_inflation", AnnualInflation.class).list();

        transaction.commit();
        session.close();

        return convertToDTO(result);
    }

    IndicatorDTO convertToDTO(List<AnnualInflation> indList) {
        var name = AnnualInflation.NAME;
        var periodType = AnnualInflation.PERIOD_TYPE;
        var values = new TreeMap<Date, BigDecimal>();
        for (AnnualInflation ind : indList) {
            values.put(ind.period, ind.value);
        }
        return new IndicatorDTO(name, periodType, values);
    }
}
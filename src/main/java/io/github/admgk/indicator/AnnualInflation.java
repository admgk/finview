package io.github.admgk.indicator;

import io.github.admgk.utils.Period;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name="annual_inflation")
class AnnualInflation extends Inflation {
    static final String NAME = "Inflation";
    static final Period PERIOD_TYPE = Period.YEAR;

    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    Integer id;

    @Column(name = "cpi_period")
    Date cpiPeriod;

    @Column(name = "cpi_value")
    BigDecimal cpiValue;

    public AnnualInflation() {

    }

    public AnnualInflation(Integer id, Date cpiPeriod, BigDecimal cpiValue) {
        this.id = id;
        this.cpiPeriod = cpiPeriod;
        this.cpiValue = cpiValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    String getNAME() {
        return NAME;
    }

    @Override
    Period getPERIOD_TYPE() {
        return PERIOD_TYPE;
    }

    @Override
    public Date getPeriod() {
        return cpiPeriod;
    }

    public void setPeriod(Date cpiPeriod) {
        this.cpiPeriod = cpiPeriod;
    }

    @Override
    public BigDecimal getValue() {
        return cpiValue;
    }

    public void setValue(BigDecimal cpiValue) {
        this.cpiValue = cpiValue;
    }
}

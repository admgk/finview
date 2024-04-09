package io.github.admgk.indicator;

import io.github.admgk.utils.Period;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name="annual_inflation")
class AnnualInflation extends Inflation {
//    static final String NAME = "Inflation";
//    static final Period PERIOD_TYPE = Period.YEAR;

    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    Integer id;

    String cpi_period;
    BigDecimal cpi_value;

    public AnnualInflation() {

    }

    public AnnualInflation(Integer id, String cpi_period, BigDecimal cpi_value) {
        this.id = id;
        this.cpi_period = cpi_period;
        this.cpi_value = cpi_value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriod() {
        return cpi_period;
    }

    public void setPeriod(String cpi_period) {
        this.cpi_period = cpi_period;
    }

    public BigDecimal getValue() {
        return cpi_value;
    }

    public void setValue(BigDecimal cpi_value) {
        this.cpi_value = cpi_value;
    }
}

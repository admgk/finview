package io.github.admgk.indicator;

import io.github.admgk.utils.Period;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name="annual_inflation")
class AnnualInflation extends Inflation {
    static final String NAME = "Inflation";
    static final Period PERIOD_TYPE = Period.YEAR;

    @Id
    Date cpi_period;
    BigDecimal cpi_value;

    AnnualInflation() {

    }

    public AnnualInflation(Date cpi_period, BigDecimal cpi_value) {
        this.cpi_period = cpi_period;
        this.cpi_value = cpi_value;
    }

    public Date getPeriod() {
        return cpi_period;
    }

    public void setPeriod(Date cpi_period) {
        this.cpi_period = cpi_period;
    }

    public BigDecimal getValue() {
        return cpi_value;
    }

    public void setValue(BigDecimal cpi_value) {
        this.cpi_value = cpi_value;
    }
}

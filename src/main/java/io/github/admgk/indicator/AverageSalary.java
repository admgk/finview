package io.github.admgk.indicator;

import io.github.admgk.utils.Period;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

class AverageSalary extends Indicator {
    static final String NAME = "Average Salary";
    static final Period PERIOD_TYPE = Period.YEAR;

    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    Integer id;

    Date averageSalaryPeriod;
    BigDecimal averageSalaryValue;

    public AverageSalary() {}

    public AverageSalary(Integer id, Date averageSalaryPeriod, BigDecimal averageSalaryValue) {
        this.id = id;
        this.averageSalaryPeriod = averageSalaryPeriod;
        this.averageSalaryValue = averageSalaryValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Date getPeriod() {
        return averageSalaryPeriod;
    }

    public void setPeriod(Date averageSalaryPeriod) {
        this.averageSalaryPeriod = averageSalaryPeriod;
    }

    @Override
    public BigDecimal getValue() {
        return averageSalaryValue;
    }

    public void setValue(BigDecimal averageSalaryValue) {
        this.averageSalaryValue = averageSalaryValue;
    }
}

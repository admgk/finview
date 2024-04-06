package io.github.admgk.indicator;

import io.github.admgk.utils.Period;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Map;

class IndicatorDTO {
    String name;
    Period periodType;
    Map<Date, BigDecimal> values;

    public IndicatorDTO(String name, Period periodType, Map<Date, BigDecimal> values) {
        this.name = name;
        this.periodType = periodType;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Period getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Period periodType) {
        this.periodType = periodType;
    }

    public Map<Date, BigDecimal> getValues() {
        return values;
    }

    public void setValues(Map<Date, BigDecimal> values) {
        this.values = values;
    }
}


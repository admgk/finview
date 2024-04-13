package io.github.admgk.indicator;

import io.github.admgk.utils.Period;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

class IndicatorDTO {
    String name;
    Period periodType;
    Map<LocalDate, BigDecimal> values;

    public IndicatorDTO(String name, Period periodType, Map<LocalDate, BigDecimal> values) {
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

    public Map<LocalDate, BigDecimal> getValues() {
        return values;
    }

    public void setValues(Map<LocalDate, BigDecimal> values) {
        this.values = values;
    }
}


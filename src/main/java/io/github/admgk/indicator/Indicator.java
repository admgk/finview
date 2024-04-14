package io.github.admgk.indicator;

import io.github.admgk.utils.Period;

import java.math.BigDecimal;
import java.sql.Date;

abstract class Indicator {
    static String NAME;
    static Period PERIOD_TYPE;

    Date period;
    BigDecimal value;

    abstract String getNAME();
    abstract Period getPERIOD_TYPE();

    abstract Date getPeriod();
    abstract BigDecimal getValue();

}

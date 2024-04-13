package io.github.admgk.indicator;

import io.github.admgk.utils.Period;

import java.math.BigDecimal;
import java.sql.Date;

abstract class Indicator {
    static String name;
    static Period periodRange;

    Date period;
    BigDecimal value;

    abstract Date getPeriod();
    abstract BigDecimal getValue();

}

package io.github.admgk.indicator;

import io.github.admgk.utils.IndName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

class IndicatorService {
    private final Logger logger = LoggerFactory.getLogger(IndicatorService.class);

    List<AnnualInflation> invokeRepositoryOf(String indicator) {
        var indName = validateIndParameter(indicator);
        switch (indName) {
            case INFLATION:
                return new AnnualInflationRepository().findAll();
            default:
                return new AnnualInflationRepository().findAll();
        }
    }

    IndName validateIndParameter(String indicator) {
        Integer indOrdinal = null;
        try {
            indOrdinal = Integer.valueOf(indicator);
        } catch (NumberFormatException e) {
            logger.warn("Non numeric indicator ID used " + indicator);
        }

        for (IndName ind : IndName.values()) {
            if (ind.ordinal() == indOrdinal) {
                return ind;
            }
        }
        return IndName.INFLATION;
    }
}

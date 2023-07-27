package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestCalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void calcRestMonths (int income, int expenses, int threshold, int expected) {

        RestCalcService calcService = new RestCalcService();
        int actual = calcService.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}

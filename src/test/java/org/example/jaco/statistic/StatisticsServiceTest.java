package org.example.jaco.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMaxinTheEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 22};
        long expected = 22;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldDisplayTheSumOfAllSales() {
        StatsService service = new StatsService();

        long[] monthlyStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSum(monthlyStatistics);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldDisplayTheAverageAmountOfSalesPerMonth() {
        StatsService service = new StatsService();

        long[] monthlyStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = 15;
        long actualAverageSum = service.getAverageSum(monthlyStatistics);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void shouldDisplayTheNumberOfTheMonthOfPeakSales() {
        StatsService service = new StatsService();

        int[] monthlyStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthNumber = 8;
        int actualMonthNumber = service.getMaxMountSales(monthlyStatistics);

        Assertions.assertEquals(expectedMonthNumber, actualMonthNumber);
    }

    @Test
    public void mustShowMonthNumberWithMinimumSales() {
        StatsService service = new StatsService();

        int[] monthlyStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthNumber = 9;
        int actualMonthNumber = service.getMinMountSales(monthlyStatistics);

        Assertions.assertEquals(expectedMonthNumber, actualMonthNumber);
    }

    @Test
    public void shouldDisplayTheNumberOfMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        long[] monthlyStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberOfMonth = 5;
        int actualNumberOfMonth = service.monthsWithBelowAverageSales(monthlyStatistics);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);
    }

    @Test
    public void shouldDisplayTheNumberOfMonthsWithAboveAverageSales() {
        StatsService service = new StatsService();

        long[] monthlyStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberOfMonth = 5;
        int actualNumberOfMonth = service.monthsWithAboveAverageSales(monthlyStatistics);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);
    }
}

package ru.netology.stats;

public class StatsService {

    public int getSum(int[] monthlyStatistics) {

        int sum = 0;
        for (int i = 0; i < monthlyStatistics.length; i++) {

            sum = sum + monthlyStatistics[i];
        }
        return (sum);
    }

    public int getAverageSum(int[] monthlyStatistics) {

        int averageSum = getSum(monthlyStatistics) / monthlyStatistics.length;
        return (averageSum);
    }

    public int getMaxMountSales(int[] monthlyStatistics) {

        int maxMount = 0;
        for (int i = 0; i < monthlyStatistics.length; i++) {

            if (monthlyStatistics[i] >= monthlyStatistics[maxMount]) {
                maxMount = i;
            }
        }
        maxMount++;
        return (maxMount);
    }

    public int getMinMountSales(int[] monthlyStatistics) {

        int minMount = 0;
        for (int i = 0; i < monthlyStatistics.length; i++) {

            if (monthlyStatistics[i] < monthlyStatistics[minMount]) {
                minMount = i;
            }
        }
        minMount++;
        return (minMount);
    }

    public int numberOfMonthsInWhichSalesWereBelowAverage(int[] monthlyStatistics) {

        int monthsOfSalesBelowAverage = 0;
        int averageSum = getAverageSum(monthlyStatistics);
        for (int i = 0; i < monthlyStatistics.length; i++) {

            if (monthlyStatistics[i] < averageSum) {
                monthsOfSalesBelowAverage++;
            }
        }
        return (monthsOfSalesBelowAverage);
    }

    public int numberOfMonthsInWhichSalesWereAboveAverage(int[] monthlyStatistics) {

        int monthsWithAboveAverageSales = 0;
        int averageSum = getAverageSum(monthlyStatistics);
        for (int i = 0; i < monthlyStatistics.length; i++) {

            if (monthlyStatistics[i] > averageSum) {
                monthsWithAboveAverageSales++;
            }
        }
        return (monthsWithAboveAverageSales);
    }
}

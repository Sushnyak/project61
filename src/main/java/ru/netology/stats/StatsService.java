package ru.netology.stats;

public class StatsService {

    public long getSum(long[] monthlyStatistics) {

        long sum = 0;
        for (int i = 0; i < monthlyStatistics.length; i++) {

            sum = sum + monthlyStatistics[i];
        }
        return (sum);
    }

    public long getAverageSum(long[] monthlyStatistics) {

        long averageSum = getSum(monthlyStatistics) / monthlyStatistics.length;
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

    public int monthsWithBelowAverageSales(long[] monthlyStatistics) {

        int monthsOfSalesBelowAverage = 0;
        long averageSum = getAverageSum(monthlyStatistics);
        for (int i = 0; i < monthlyStatistics.length; i++) {

            if (monthlyStatistics[i] < averageSum) {
                monthsOfSalesBelowAverage++;
            }
        }
        return (monthsOfSalesBelowAverage);
    }

    public int monthsWithAboveAverageSales(long[] monthlyStatistics) {

        int monthsWithAboveAverageSales = 0;
        long averageSum = getAverageSum(monthlyStatistics);
        for (int i = 0; i < monthlyStatistics.length; i++) {

            if (monthlyStatistics[i] > averageSum) {
                monthsWithAboveAverageSales++;
            }
        }
        return (monthsWithAboveAverageSales);
    }
}

package org.example;

import ru.netology.stats.StatsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] monthlyStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(monthlyStatistics.length);
        int a = service.numberOfMonthsInWhichSalesWereAboveAverage(monthlyStatistics);
        System.out.println(a);
    }
}

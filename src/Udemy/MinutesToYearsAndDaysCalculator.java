package Udemy;

public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {

        MinutesToYearsAndDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes) {

        long days = 0;
        long year = 0;

        if (minutes < 0)  {
            System.out.println("Invalid Value");
            return;
        }else {
            days = (minutes % 525600) / 1440;
            year = (minutes / 525600);
            System.out.println(minutes + " min = " + year + " y and " + days + " d");

        }
    }
}

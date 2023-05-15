package Udemy;

public class LeapYearCalculator {

    public static void main(String[] args) {
        boolean output;
        output = LeapYearCalculator.isLeapYear(-1600);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(1600);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(2017);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(2000);
        System.out.println(output);
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999 ){
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}


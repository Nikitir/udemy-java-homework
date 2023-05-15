package Udemy;

public class DecimalComparator {
    public static void main(String[] args) {

        DecimalComparator decimal = new DecimalComparator();

        System.out.println(decimal.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(decimal.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(decimal.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }


    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        int num1 = (int) (number1 * 1000);
        int num2 = (int) (number2 * 1000);

        if (num1 == num2) {
            return true;
        }
        return false;
    }
}

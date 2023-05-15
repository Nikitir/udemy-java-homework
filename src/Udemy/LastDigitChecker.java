package Udemy;

public class LastDigitChecker {
    public static void main(String[] args) {

        //hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
        //
        //hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
        //
        //hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

        boolean match;
        match = hasSameLastDigit(9, 99, 999);
        System.out.println(match);
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        int lastDigit1, lastDigit2, lastDigit3 = 0;

        if ((isValid(number1)) && (isValid(number2)) && (isValid(number3))) {

            lastDigit1 = number1 % 10;
            lastDigit2 = number2 % 10;
            lastDigit3 = number3 % 10;

            if ((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}

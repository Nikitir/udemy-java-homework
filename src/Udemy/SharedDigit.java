package Udemy;

public class SharedDigit {
    public static void main(String[] args) {
        //hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
        //
        //hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
        //
        //hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

        boolean num = hasSharedDigit(12, 23);
        System.out.println(num);
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        int lastDigit1 = 0; //last digit of first number
        int lastDigit2 = 0; //last digit of second number
        int value = number2; //original

        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {

            while (number1 > 0) {
                lastDigit1 = number1 % 10;
                System.out.println(lastDigit1);

                do {
                    lastDigit2 = number2 % 10;
                    System.out.println(lastDigit2);

                    if (lastDigit1 == lastDigit2) {
                        return true;

                    } else {
                        number2 /= 10;
                    }
                } while (number2 > 0);
                number2 = value;
                number1 /= 10;
            }
        }
        return false;
    }
}

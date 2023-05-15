package Udemy;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        //sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        //sumFirstAndLastDigit(257); → should return 9
        //sumFirstAndLastDigit(0); → should return 0
        //sumFirstAndLastDigit(5); → should return 10
        //sumFirstAndLastDigit(-10); → should return -1
        int number = 257;
        int sum = 0;

        sum = sumFirstAndLastDigit(number);
        System.out.println("Sum: " + sum);
    }

    public static int sumFirstAndLastDigit(int number) {

        //Invalid options
        if (number < 0) {
            return -1;
        }
        int firstDigit = number;
        int lastDigit = 0;
        lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        firstDigit = number;
        return firstDigit + lastDigit;
    }
}

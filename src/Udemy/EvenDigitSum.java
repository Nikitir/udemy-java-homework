package Udemy;

public class EvenDigitSum {
    public static void main(String[] args) {
        //getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
        //getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
        //getEvenDigitSum(-22); → should return -1 since the number is negative
        int sum = 0;
        sum = getEvenDigitSum(123456789);
        System.out.println(sum);
    }

    public static int getEvenDigitSum(int number) {
        //Invalid Option
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit = 0;

        while (number > 0) {
            lastDigit = number % 10;

            if (number % 2 == 0) {
                sum += lastDigit;
                number /= 10;
            } else {
                number /= 10;
                continue;
            }
        }
        return sum;
    }
}

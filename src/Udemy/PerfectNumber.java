package Udemy;

public class PerfectNumber {

    public static void main(String[] args) {

        //isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        //
        //isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        //
        //isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
        //
        //isPerfectNumber(-1); should return false since the number is < 1

        boolean yes = false;
        yes = isPerfectNumber(28);
        System.out.println(yes);
    }

    public static boolean isPerfectNumber(int number) {

        int sum = 0;

        //Invalid option
        if (number < 1) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("Perfect");
            return true;
        }
        System.out.println("Not Perfect");
        return false;
    }
}

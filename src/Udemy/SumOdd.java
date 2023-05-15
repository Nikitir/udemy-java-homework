package Udemy;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println("The sum is " + SumOdd.sumOdd(1, 100));
        System.out.println("The sum is " + SumOdd.sumOdd(-1, 100));
        System.out.println("The sum is " + SumOdd.sumOdd(100, 100));
        System.out.println("The sum is " + SumOdd.sumOdd(13, 13));
        System.out.println("The sum is " + SumOdd.sumOdd(100, -100));
        System.out.println("The sum is " + SumOdd.sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {

        if (number > 0 && number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && start <= end) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    System.out.println("This number is " + i);
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}

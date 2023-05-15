package Udemy;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        //getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
        //
        //getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
        //
        //getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
        //
        //getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder

        int num = getGreatestCommonDivisor(9, 18);
        System.out.println(num);
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int gcd = 0; //GreatestCommonDivisor

        if (first >= 10 && second >= 10) {

            for (int i = 1; i <= first && i <= second; i++) {

                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
        } else {
            return -1;
        }
        return gcd;
    }
}

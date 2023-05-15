package Udemy;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(1450);
    }

    public static void numberToWords(int number) {

        int reverse, lastDigit, value, num = 0;

        //Invalid option
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        reverse = reverse(number);
        value = getDigitCount(reverse);

        while (reverse != 0 || reverse > 0) {
            lastDigit = reverse % 10;
            reverse /= 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
        }

        num = getDigitCount(number);
        if (value != num) {
            int total = num - value;

            for (int i = 0; i < total; i++) {
                System.out.println("Zero");
            }
        } else if (number == 0) {
            System.out.println("Zero");
        }
    }


    public static int reverse(int number) {

        int lastDigit = 0;
        int num = 0;
        while (number != 0 || number > 0) {
            lastDigit = number % 10;
            num *= 10;
            num += lastDigit;
            number /= 10;
        }
        return num;
    }

    public static int getDigitCount(int number) {

        int count = 0;

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        while (number > 0 || number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}

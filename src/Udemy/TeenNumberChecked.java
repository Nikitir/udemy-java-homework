package Udemy;

public class TeenNumberChecked {

    public static void main(String[] args) {

        TeenNumberChecked teen = new TeenNumberChecked();
        boolean check = false;

        check = teen.hasTeen(9, 99, 19);
        System.out.println(check);
        check = teen.hasTeen(23, 15, 42);
        System.out.println(check);
        check = teen.hasTeen(22, 23, 34);
        System.out.println(check);
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int num1) {
        if ((num1 >= 13 && num1 <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}


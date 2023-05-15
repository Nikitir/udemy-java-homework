package Udemy;

public class BarkingDog {

    public static void main(String[] args) {

        BarkingDog dog = new BarkingDog();
        boolean wakeup = true;
        wakeup = dog.shouldWakeUp(true, 1);
        System.out.println(wakeup);
        wakeup = dog.shouldWakeUp(false, 2);
        System.out.println(wakeup);
        wakeup = dog.shouldWakeUp(true, 8);
        System.out.println(wakeup);
        wakeup = dog.shouldWakeUp(true, -1);
        System.out.println(wakeup);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
            return true;
        } else
            return false;
    }
}
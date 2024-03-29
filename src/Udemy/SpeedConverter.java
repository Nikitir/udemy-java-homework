package Udemy;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        long miles = Math.round(kilometersPerHour / 1.609);
        return miles;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long conversion = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + conversion + " mi/h");
    }
}

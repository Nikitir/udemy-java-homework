package Udemy;

public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println("The first area is " + AreaCalculator.area(5.0));
        System.out.println("The second area is " + AreaCalculator.area(-1.0));
        System.out.println("The first area is " + AreaCalculator.area(5.0, 4.0));
        System.out.println("The second area is " + AreaCalculator.area(1.0, 4.0));

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }else {
            double circleArea = 0;
            circleArea = radius * radius * Math.PI;
            return circleArea;
        }
    }
    public static double area(double x, double y) {
        if (x < 0 || y < 0 || (x < 0 && y < 0)) {
            return -1;
        }
        return x * y;
    }
}

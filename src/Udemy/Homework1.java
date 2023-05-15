package Udemy;

public class Homework1 {

    public static void main(String[] args) {

        double myFirstValue = 20.00, mySecondValue = 80.00;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00;
        System.out.println("My values total = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00;
        System.out.println("The remainder  = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println(" Is no remainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
package Udemy;

public class MegaBytesConverter {

    public static void main(String[] args) {

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid value");
        } else {
            long tomega = (kiloBytes % 1024);
            long kilo = tomega;
            long mega = kiloBytes / 1024;
            System.out.println(kiloBytes + "KB = " + mega + "MB and " + kilo + "KB");
        }

    }
}

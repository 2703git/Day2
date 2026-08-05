import java.util.Scanner;

public class Pr2 {
    public static double kilobyte(double bytes){
        return bytes/1024;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bytes: ");
        double bytes = scanner.nextDouble();
        System.out.printf("in Kilobytes: %.2f",kilobyte(bytes));
    }
}
import java.util.Scanner;

public class Pr13 {
    public static int product(int n){
        int ones = n%10;
        int tens = (n%100)/10;
        int hundreds = n/100;
        return ones*tens*hundreds;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3-digit: ");
        int n = scanner.nextInt();
        System.out.println("Product of digits: "+product(n));
    }
}
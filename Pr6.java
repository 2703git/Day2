import java.util.Scanner;

public class Pr6 {
    public static int newNum(int n){
        int ones = n%10;
        int remain = n/10;
        return (ones*100)+remain;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3-digits number: ");
        int n = scanner.nextInt();
        System.out.println("New number: "+newNum(n));
    }
}
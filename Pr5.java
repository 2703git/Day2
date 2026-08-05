import java.util.Scanner;

public class Pr5 {
    public static int hundreds(int n){
        int hundred = (n%1000)/100;
        return hundred;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number(>999): ");
        int num = scanner.nextInt();
        System.out.println("Hundreds: "+hundreds(num));
    }
}
import java.util.Scanner;

public class Pr14 {
    public static double length(int r){
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = scanner.nextInt();
        System.out.printf("Length of the circle: %.2f",length(radius));
    }
}
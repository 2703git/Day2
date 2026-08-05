import java.util.Scanner;

public class Pr8 {
    public static int time(int S){
        int velocity = 7;
        return S/velocity;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance: ");
        int S = scanner.nextInt();
        System.out.println("Time(hour): "+time(S));
    }
}
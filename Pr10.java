import java.util.Scanner;

public class Pr10 {
    public static double sec(double info){
        double velocity = 750;
        double sec = (info*1024*1024)/velocity;
        return sec;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter information(in GB): ");
        double info = scanner.nextDouble();
        System.out.printf("time(sec): %.2f",sec(info));
    }
}
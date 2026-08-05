import java.util.Scanner;

public class Pr11 {
    public static int hour(int sec){
        return sec/3600;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int sec = scanner.nextInt();
        System.out.println("in Hour: "+hour(sec));
    }
}
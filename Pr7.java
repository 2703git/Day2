import java.util.Scanner;

public class Pr7 {
    public static int min(int day, int hour){
        return ((day*24)+hour)*60;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter days: ");
        int day = scanner.nextInt();
        System.out.print("Enter hours: ");
        int hour = scanner.nextInt();
        System.out.println("in Minutes: "+min(day,hour));
    }
}
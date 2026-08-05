import java.util.Scanner;

public class Pr9 {
    public static int hour(int week, int day){
        return ((week*7)+day)*24;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter week: ");
        int week = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.println("in hours: "+hour(week,day));
    }
}
import java.util.Scanner;

public class Pr3 {
    public static int hours(int seconds){
        return seconds/3600;
    }
    public static int minutes(int seconds){
        return (seconds%3600)/60;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int sec = scanner.nextInt();
        System.out.println("Hours: "+hours(sec));
        System.out.println("Minutes: "+minutes(sec));
    }
}
import java.util.Scanner;

public class Pr12 {
    public static int day(int sec){
        return (sec/3600)/24;
    }
    public static int hour(int sec){
        return (sec%86400)/3600;
    }
    public static int min(int sec){
        return (sec%3600)/60;
    }
    public static int seco(int sec){
        return sec%60;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int sec = scanner.nextInt();
        System.out.println("Day: "+day(sec));
        System.out.println("Hour: "+hour(sec));
        System.out.println("Minutes: "+min(sec));
        System.out.println("Seconds: "+seco(sec));
    }
}
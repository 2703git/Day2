import java.util.Scanner;

public class Pr15 {
    public static int sign(int KBFile){
        return KBFile/2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kilobyte: ");
        int kb = scanner.nextInt();
        System.out.print("Signs number: "+sign(kb));
    }
}
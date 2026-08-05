import java.util.Scanner;

public class Pr4 {
    public static int[] swap(int a, int b){
        return new int[]{b,a};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int[] res = swap(a,b);
        System.out.println("New values: a="+res[0]+", b="+res[1]);
    }
}
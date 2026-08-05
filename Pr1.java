import java.util.Scanner;

public class Pr1 {
  public static int sumOfDigits(int a){
      int ones = a%10;
      int tens = (a%100)/10;
      int hundreds = a/100;
      if (a<100 || a>999){
          return 0;
      }
      return ones+tens+hundreds;
  }
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter 3-digits number: ");
      int a = scanner.nextInt();
      System.out.println("Sum of the digits: "+sumOfDigits(a));
  }
}
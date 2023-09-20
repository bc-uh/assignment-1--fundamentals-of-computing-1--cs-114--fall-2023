// Import libraries here

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("BBBB    CCCC");
    System.out.println("B   B  C    ");
    System.out.println("BBBB   C    ");
    System.out.println("B   B  C    ");
    System.out.println("BBBB    CCCC");
    System.out.println("Enter a number in farenheit");
    int farenheit = scanner.nextInt();
    int celsius = (5/9) * (farenheit - 32);
  }
}

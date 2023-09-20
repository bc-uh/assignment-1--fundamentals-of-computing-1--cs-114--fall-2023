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
    int celsius = (5 / 9) * (farenheit - 32);
    System.out.println("Input a 5 character string");
    String inputString = scanner.nextLine();
    if (inputString.length() != 5) {
      System.out.println("It needs to be 5 characters");
    } else {
      String reversed = new StringBuilder(inputString).reverse().toString();
      String trimmed = reversed.substring(1, 4);
    }
  }
}

// Import libraries here

import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

    String finalString;
    double celsius;
    int randomNumber;

    printInitials();
    celsius = temperaturePrompt();
    finalString = stringPrompt();
    randomNumber = randomNumberGenerator();

    System.out.println("New string is: " + celsius + finalString + randomNumber);

  }
  public static void printInitials() {
    System.out.println("BBBB    CCCC");
    System.out.println("B   B  C    ");
    System.out.println("BBBB   C    ");
    System.out.println("B   B  C    ");
    System.out.println("BBBB    CCCC");
  }
  public static String stringPrompt() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input a 5 character string");
    String inputString = scanner.nextLine();
    String reversedString = new StringBuilder(inputString).reverse().toString();
    return reversedString.substring(1, 4);
  }
  public static double temperaturePrompt() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input temperature in fahrenheit");
    return scanner.nextDouble() * (5/9) + 32;
  }
  public static int randomNumberGenerator() {
      int min = 32;
      int max = 16384;

      Random random = new Random();

      return random.nextInt(max - min + 1) + min;
  }
}


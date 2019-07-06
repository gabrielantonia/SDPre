import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {
    int num1, num2;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    num1 = input.nextInt();

    System.out.println("Enter another number: ");
    num2 = input.nextInt();

    if(num1 > num2) {
      System.out.println(num1 + " Is greater than "+ num2);
    }
    else if(num2 > num1) {
      System.out.println(num2 + " Is greater than "+ num1);

    }
  }
}

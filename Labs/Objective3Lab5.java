import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {

    double  x, y, sum;
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    x = input.nextDouble();
    System.out.println("Please enter a number:");
    y = input.nextDouble();

    sum = x + y;

    System.out.println("The sum of " + x +" and " + y + " = " + sum );

    input.close();

  }
}

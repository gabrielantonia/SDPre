import java.util.Scanner;

public class Objective4Lab4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int userNum;

      System.out.println("Enter a number: ");
      userNum = scanner.nextInt();
      userNum = userNum % 2;
      if (userNum == 0)
      System.out.println("Number is Even");
      else {
        System.out.println("Number is Odd");
      }
    }
  }

import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();

      if(userNum > 0)
        System.out.println(userNum+" is GREATER than ZERO");
      else if(userNum == 0)
        System.out.println(userNum+" is EQUAL to ZERO");
      else{
        System.out.println(userNum+" is LESS than ZERO");
      }

      scanner.close();
  }
}

import java.util.Scanner;

public class SafeSquareRoot{
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    double x,y;
    String userInput, password="YES!";

    System.out.print("Are you ready?!?");
    userInput=keyboard.next();

    while(!userInput.equals(password)){
      System.out.println("I guess not! Try again! \n>");
      userInput=keyboard.next();
    }

    System.out.print("Give me a number, and I'll find its square root. ");
    System.out.print("(No negatives, please.) ");
    x=keyboard.nextDouble();

    while(x<0){
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x=keyboard.nextDouble();
    }

    y=Math.sqrt(x);
    System.out.println("The Square root of "+x+" is " +y);
  }
}

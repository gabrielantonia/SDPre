import java.util.Scanner;

public class EnterPin{
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password = "swordfish", userInput;

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.println("ENTER YOUR PASSWORD: ");
    userInput = keyboard.next();
    System.out.print("ENTER YOU PIN: ");
    entry = keyboard.nextInt();

    while(!userInput.equals(password)){
      System.out.println("INCORRECT PASSWORD. TRY AGAIN.");
      System.out.println("ENTER YOUR PASSWORD: ");
      userInput=keyboard.next();
    }

    while (entry!=pin){
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOU PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}

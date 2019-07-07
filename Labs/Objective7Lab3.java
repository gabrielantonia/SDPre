import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection = 0;

    while(true){
      printMenu();
      selection = scanner.nextInt();
      if(selection==1){
        System.out.println("Wussup my ninja?");
      }
      else if(selection==2){
        System.out.println("Truth, Justice, and The American Way!");
      }
      else if (selection==3){
        break;
      }
      else {
        System.out.println("ERROR");
      }
    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}

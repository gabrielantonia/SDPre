import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, eatingdisorder;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old.");
    System.out.print( "How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!");

    System.out.print("Do your friends call you Fatty?");
    eatingdisorder = keyboard.next();
    System.out.println(eatingdisorder + "! Yeah, I figured as much. ");
    System.out.print("Finally, Fatty, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println( name + ".");



    // no it does not because it assumes a .0
    // no , it interprets the number as a String
    // n/a, seventeen, two hundred, a lot
  }
}

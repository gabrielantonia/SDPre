import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double kg, m, bmi, lbs, in, ft;

    System.out.print("Your height (feet only): ");
    ft = keyboard.nextDouble();

    System.out.print("Your height (inches only): ");
    in = keyboard.nextDouble();

    System.out.print( "Your weight in lbs: ");
    lbs = keyboard.nextDouble();

    in = (ft*12) + in;
    kg = lbs * 0.453592;
    m = in * 0.0254;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi);

  }
}

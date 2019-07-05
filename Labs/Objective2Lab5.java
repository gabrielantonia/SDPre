public class Objective2Lab5{
  public static void main(String[] args) {
    double side1, side2, hypotenuse;
    side1 = 3;
    side2 = 4;

    hypotenuse = Math.sqrt( (Math.pow(side1, 2) + Math.pow(side2,2) ));
    System.out.println("The hypotenuse of a triangle with sides 3.0 and 4.0 is  "+ hypotenuse);

  }
}

public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, z;
    double seconds, e, checking, weight;
    String firstName, lastName, title, herfirstName, herlastName;

    x = 10;
    y = 400;
    age = 39;
    z = 15;

    seconds = 4.71;
    e= 2.71828182845904523536;
    checking = 1.89;
    weight = 135.1;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    herfirstName = "Sarah";
    herlastName = "Marshall";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds. " );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( herfirstName + " " + herlastName + " weighed in at " + weight + " when she turned " + z);
  }
}

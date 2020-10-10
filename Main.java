import java.util.Scanner;
/**
 *This program will start at 100 and count down by 5 until it gets as low as possible without going pased the users entered number
 * @author Khazina
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create the scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user for an integer to count down to 
    System.out.println("Please enter an integer to count down to");

    //Store user input using variable
    int down = input.nextInt();

    //Pre loop code 
    System.out.println("Count Down:");

    //Create a counter variable
    int count = 100;

    //Use a loop to count down from hundred by fives without going passed users integer
    while(count >= down){
      //Print the number we are on
      System.out.println(count);

      //Add five to count/ accumulator
      count = count - 5;
    }
  }
}


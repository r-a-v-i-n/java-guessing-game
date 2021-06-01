import java.util.Scanner;
import java.util.Random;

/*

A number-guessing game.

*/

public class Game {
  public static void main(String[] args){
    System.out.println("Hello world");
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");

    String name = input.nextLine();  // Get user input
    System.out.println("Nice," + name + "!");

    // create an instance of the Random object
    Random rand = new Random();

    // call method nextInt and pass in upper range bound
    int number = rand.nextInt(100);

//     To read integers from console, use Scanner class.
// Allow a use to add an integer using the nextInt() method.
    int number_of_guesses = 0;

    while (true){
      System.out.print( "Enter your guess: " );
      int guess = input.nextInt();
     
        String bad_input = input.next();
          System.out.println("That's not an integer, try again");
          continue;
      number_of_guesses += 1;

  // In the same way, take another input in a new variable.

        if (guess > number){
            System.out.println("Your guess is too high, try again.");
        } else if (guess < number){
            System.out.println("Your guess is too low, try again.");
        } else if (guess != ){
            System.out.printIn("Please enter a number.");
        } else if (guess > 100){
            System.out.printIn("It's not greater than 100, dumbass.");
        } else if (guess < 1){
            System.out.printIn("It's not less than one, you dismal dreamer!");
        } else {
            System.out.println("Well done, " + name + "! You found my number in " + number_of_guesses + " tries!");
            break;
        }
      }
  }
}










// solution from coursework, used for learning from how others did this


/*

A number-guessing game.

*/

import java.util.Random;
import java.util.Scanner;  
import java.util.InputMismatchException;

public class Game {
  public static void main(String[] args){
    System.out.println("Howdy, what's your name?");
    System.out.println("(type in your name) ");

    Scanner input = new Scanner(System.in);

    String name = input.nextLine();

    System.out.println(name + " I'm thinking of a number between 1 and 100.");
    System.out.println("Can you guess what the number is?");


    Random rand = new Random();
    int number = rand.nextInt(100);
    int tries = 0;

    System.out.println("The number is "+number);

    System.out.println(name + " I'm thinking of a number between 1 and 100.");
    System.out.println("Can you guess what the number is?");

    while (true) {
        int guess;
        try {
            guess = input.nextInt();
        } catch(InputMismatchException e) {
            String bad_input = input.next();   // need to progress past bad input
            System.out.println("That's not an integer, try again");
            continue;
        }        
        
        if (guess < 1 || guess > 100){
            System.out.println(guess + " is not a valid number, try again");
            continue;
        }

        tries = tries + 1;

        if (guess < number) {
            System.out.println("Your guess is too low, try again.");
        
        } else if (guess > number) {
            System.out.println("Your guess is too high, try again.");    
        
        } else {
            System.out.println("Well done " + name);
            System.out.println("You found my number in " + tries + " tries!");
            break;
        }

    }

  }

}




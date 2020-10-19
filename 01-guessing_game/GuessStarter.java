import java.util.Random;
import java.util.Scanner;

public class GuessStarter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    int Number = 0;
    String name;

    System.out.println("What is your name?");
    name = input.nextLine();

    System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is, " + name + "?");

    System.out.print("Type a number: ");
    Number = input.nextInt();

    System.out.println("Your guess is: " + Number);

    System.out.println("The number I was thinking of was: " + number);

    System.out.println("You were off by: " + (Math.abs(number - Number)));

    System.out.println("Thanks for playing, better luck next time!");


  }//end main method




















}//end class

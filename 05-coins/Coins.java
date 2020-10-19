//your names here
//Zhi Feng , JINXINXIN , Yang Lu
import java.util.*;

class Coins {
  public static void main(String[] args) {
    // greet the user of your with a certain
    // amount of base coins to their bank (can be random or fixed)
    //Random rng = new Random();
    Scanner in = new Scanner(System.in);
    System.out.println("You have 500 coins in your bank.");
    boolean playing = true;
    int totalCoins = 500;


    // create a looping structure that allows the user to play
    // A) a fixed number of rounds
    // OR
    // B) until they choose to quit
    // (this is prefereable, but we didn't review this type of loop yet)
    while (playing = true){
    System.out.println("What do you want to do \ntype 1 to play \ntype 2 to shop \ntype 3 to quit");
    int input = in.nextInt();

    if (input == 1){
    int earnedCoin = play();
    totalCoins += earnedCoin;
    System.out.println("you have "+ totalCoins +" in your bank");
    }

    else if (input == 2){
    int UsedCoin = shop();
    totalCoins -= UsedCoin;
    System.out.println("You have "+ totalCoins +" in your bank");
    }

    else if (input == 3){}
    //playing = false; //for some reason don't work
    System.exit(0);
    }


    // in the loop, present the user with a menu of options that asks the      user what they want to do:
    // 1. play
    // 2. shop
    // 3. quit
    // (feel free to add more options to this if you're inspired)

    // based on their entry, call the method to perform that behavior
    // at all times, keep updating the user's bank balance


  }//end main method


  /*
   * Name: play
   * Purpose: simulate a round of the game, award the user a random
              amount of coins for playing
   * Input: ???
   * Return: a random number of coins the user won that round
   */
  public static int play() {
    // generate random coins from 1 - 100
    int coins = ((int)(Math.random() * 100 )+1);
    return coins;
  }




  /*
   * Name: shop
   * Purpose: allow the player to spend coins
   * Input: amount of coins user currently has
   * Return: how many coins spent/updated balance
   */
  public static int shop() {
    Scanner input = new Scanner(System.in);
    System.out.println("How much do you want to spend?");
    int amount = input.nextInt();

    return amount;
  }

}//end class

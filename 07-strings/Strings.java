import java.util.Scanner;
public class Strings{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String str = "The lion does not concern himself with the opinions of the sheep";

    System.out.println(str.indexOf("i"));
    System.out.println(str.lastIndexOf("o"));
    System.out.println(str.indexOf("sheep"));
    System.out.println(str.substring(4,9));

    System.out.println("Type any word: ");
    String word = input.nextLine();
    System.out.println(word.toUpperCase());
    System.out.println(word.toLowerCase());

   }//end main

}//end class

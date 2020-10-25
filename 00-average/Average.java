import java.util.Scanner;
public class Average{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double sum = 0;

    for (int i = 0; i < 5; i++){
      System.out.print("Enter your grades: ");
      sum += input.nextInt();
    }//end for loop

    double Average = (double) sum / 5;

    System.out.println(Average);

  }//end main method
}//end class

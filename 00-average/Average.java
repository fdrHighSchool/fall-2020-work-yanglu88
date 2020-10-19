import java.util.Scanner;
public class Average{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double sum = 0;

    System.out.print("Enter your first grade:");
    sum += input.nextInt();

    System.out.print("Enter your second grade:");
    sum += input.nextInt();

    System.out.print("Enter your third grade:");
    sum += input.nextInt();

    System.out.print("Enter your fourth grade:");
    sum += input.nextInt();

    System.out.print("Enter your fifth grade:");
    sum += input.nextInt();

    double Average = (double) sum / 5;

    System.out.println(Average);


  }
}

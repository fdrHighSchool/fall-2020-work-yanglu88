import java.util.Scanner;
public class Distance{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double x1, x2, y1, y2;

    System.out.print("What is the x coordinate: ");
    x1 = input.nextDouble();
    System.out.print("What is the y coordinate: ");
    y1 = input.nextDouble();
    System.out.print("What is the new x coordinate: ");
    x2 = input.nextDouble();
    System.out.print("What is the new y coordinate: ");
    y2 = input.nextDouble();

    double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2-y1));
    System.out.println("The distance is: " + distance);

    System.out.print("What is the x coordinate: ");
    x1 = input.nextDouble();
    System.out.print("What is the y coodrinate: ");
    y1 = input.nextDouble();
    System.out.print("What is the new x coordinate: ");
    x2 = input.nextDouble();
    System.out.print("What is the new y coordinate: ");
    y2 = input.nextDouble();

    double taxicabDistance = Math.abs(x2 - x1) + Math.abs(y2 - y1);
    System.out.print("The taxicabDistance is: " + taxicabDistance);

  }//end main method


}//end class

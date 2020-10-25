import java.util.Scanner;
public class Distance{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;

    System.out.print("What is the x coordinate: ");
    x1 = input.nextInt();
    System.out.print("What is the y coodrinate: ");
    y1 = input.nextInt();
    System.out.print("What is the new x coordinate: ");
    x2 = input.nextInt();
    System.out.print("What is the new y coordinate: ");
    y2 = input.nextInt();

    double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2-y1));
    System.out.println("The distance is: " + distance);

    System.out.print("What is the x coordinate: ");
    x1 = input.nextInt();
    System.out.print("What is the y coodrinate: ");
    y1 = input.nextInt();
    System.out.print("What is the new x coordinate: ");
    x2 = input.nextInt();
    System.out.print("What is the new y coordinate: ");
    y2 = input.nextInt();

    double taxicabDistance = Math.abs(x2 - x1) + Math.abs(y2 - y1);
    System.out.print("The taxicabDistance is: " + taxicabDistance);

  }//end main method


}//end class

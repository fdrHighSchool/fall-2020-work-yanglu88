import java.util.Scanner;
public class Distance{
  public static void main(String[] args){
    cartesianDistance();
    taxicabDistance();

    }//end main method

  public static void cartesianDistance(){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first point: ");
    String p1 = input.nextLine();

    System.out.print("Enter the second point: ");
    String p2 = input.nextLine();

    double x1 = getX(p1);
    double x2 = getX(p2);
    double y1 = getY(p1);
    double y2 = getY(p2);

    double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2-y1));
    System.out.println("The distance is: " + distance);

  }//end cartesianDistance


  public static void taxicabDistance(){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first point: ");
    String p1 = input.nextLine();

    System.out.print("Enter the second point: ");
    String p2 = input.nextLine();

    double x1 = getX(p1);
    double x2 = getX(p2);
    double y1 = getY(p1);
    double y2 = getY(p2);

    double taxicabDistance = Math.abs(x2 - x1) + Math.abs(y2 - y1);
    System.out.print("The taxicab distance is: " + taxicabDistance);

  }//end taxicabDistance

  public static int getX(String point){
    int comma = point.indexOf(",");
    String x = point.substring(1, comma);

    return Integer.parseInt(x);
  }//end getX

  public static int getY(String point){
    int comma = point.indexOf(",");
    String y = point.substring(comma + 2 , point.length()-1);

    return Integer.parseInt(y);
  }//end getY


}//end class

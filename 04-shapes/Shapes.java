import java.util.Scanner;
public class Shapes {
  public static void main(String[] args) {
    areaRectangle();
    areaTriangle();
    areaCircle();
    areaTrapezoid();

  }//end main method

  public static void areaRectangle(){
    Scanner input = new Scanner(System.in);
    int length = 0;
    int width = 0;

    System.out.print("The width of the rectangle is: ");
    width = input.nextInt();

    System.out.print("The length of the rectangle is: ");
    length = input.nextInt();

    int areaRectangle = length * width;
    System.out.println("The area of the rectangle is: " + areaRectangle);

  }//end areaRectangle

  public static void areaTriangle(){
    Scanner input = new Scanner(System.in);
    int base = 0;
    int height = 0;

    System.out.print("The base of the triangle is: ");
    base = input.nextInt();

    System.out.print("The height of the triangle is: ");
    height = input.nextInt();

    double areaTriangle = ( base * height ) / 2.0;
    System.out.println("The area of the triangle is: " + areaTriangle);

  }//end areaTriangle

  public static void areaCircle(){ 
    Scanner input = new Scanner(System.in);
    int radius = 0;
    double pi = 3.1415926;

    System.out.print("The radius of the circle is: ");
    radius = input.nextInt();

    double areaCircle = radius * radius * pi;
    System.out.println("The area of the circle is: "+ areaCircle);

  }//end areaCircle

  public static void areaTrapezoid(){
    Scanner input = new Scanner(System.in);
    int base1 = 0;
    int base2 = 0;
    int height = 0;

    System.out.print("The first base of the trapezoid is: ");
    base1 = input.nextInt();

    System.out.print("The second base of the trapezoid is: ");
    base2 = input.nextInt();

    System.out.print("The height of the trapezoid is: ");
    height = input.nextInt();

    double areaTrapezoid = (base1 + base2)/2.0 * height;
    System.out.println("The area of the trapezoid is: " + areaTrapezoid);

  }//end areaTrapezoid


}//end class

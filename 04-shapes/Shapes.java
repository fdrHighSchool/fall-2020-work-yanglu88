import java.util.Scanner;
public class Shapes {
  public static void main(String[] args) {
    areaRectangle();
    areaTriangle();
    areaCircle();
    areaTrapezoid();
    volumeCube();
    volumeTrianglularPrism();
    volumeRectangularPrism();
    volumeSphere();

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

  public static void volumeCube(){
    Scanner input = new Scanner(System.in);
    double length = 0;

    System.out.print("The length of the side of the cube is: ");
    length = input.nextDouble();

    double volumeCube = length * length * length;
    System.out.println("The volume of the cube is: " + volumeCube);

  }//end volumeCube

  public static void volumeTrianglularPrism(){
    Scanner input = new Scanner(System.in);
    double length = 0;
    double height = 0;
    double base = 0;

    System.out.print("The length of the triangular prism is: ");
    length = input.nextDouble();

    System.out.print("The height of the triangular prism is: ");
    height = input.nextDouble();

    System.out.print("The base of the triangular prism is: ");
    base = input.nextDouble();

    double volumeTrianglularPrism =  ( base * height * length ) / 2;

    System.out.println("The volume of the triangular prism is: " + volumeTrianglularPrism );

  }//end volumeTrianglularPrism

  public static void volumeRectangularPrism(){
    Scanner input = new Scanner(System.in);
    double width = 0;
    double length = 0;
    double height = 0;

    System.out.print("The width of the rectangular prism is: ");
    width = input.nextDouble();

    System.out.print("The length of the rectangular prism is: ");
    length = input.nextDouble();

    System.out.print("The height of the rectangular prism is: ");
    height = input.nextDouble();

    double volumeRectangularPrism = length * width * height;
    System.out.println("The volume of the rectangular prism is:" + volumeRectangularPrism);


  }//end volumeRectangularPrism

  public static void volumeSphere(){
    Scanner input = new Scanner(System.in);
    double radius = 0;
    double pi = 3.1415926;

    System.out.print("The radius of the sphere is: ");
    radius = input.nextDouble();

    double volumeSphere = (4.0/3) * pi * radius * radius * radius;
    System.out.print("The volume of the sphere is: " + volumeSphere);

  }//end volumeSphere


}//end class

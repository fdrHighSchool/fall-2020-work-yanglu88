import java.util.Scanner;
public class Temperature{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double temperature = 0;


    System.out.print("What is the temperature in degrees Celsius: ");
    temperature += in.nextInt();

    double newTemperature = (temperature* 9 / 5) + 32;

    System.out.printf("%.1f C = %.1f F", temperature, newTemperature);


  }//end main method




}//end class

import java.util.Scanner;

public class Buggy{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Bill-Splitter");
		System.out.print("Enter the total, pre-tax: ");

		double total = input.nextInt();
		System.out.print("How many people? ");

		int numPeople = input.nextInt();

		System.out.print("Enter the % tax: ");
		double taxInput = input.nextInt();
		double tax = (taxInput/100) * total;

		System.out.print("How much would you like to tip? ");
		double tip = input.nextInt();

		double finalTotal = ( total + tax + tip ) / numPeople;

		System.out.println("Each person must pay $" + finalTotal);

	}//end main method
}//end class

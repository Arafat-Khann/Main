import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in dollars and cents ");
		double amount = input.nextDouble();

		int cents = (int) (amount * 100 );
		
		int dollars = cents / 100;
		cents = cents % 100;

		int quaters = cents / 25;
		cents = cents % 25;

		int dimes = cents / 10;
		cents = cents % 10;

		int nickels = cents / 5;
      		cents = cents % 5;
		
		int pennies = cents;
		
		 System.out.println("Your amount consists of:");
        	System.out.println(dollars + " dollars");
        	System.out.println(quaters + " quarters");
        	System.out.println(dimes + " dimes");
        	System.out.println(nickels + " nickels");
        	System.out.println(pennies + " pennies");
    }
}
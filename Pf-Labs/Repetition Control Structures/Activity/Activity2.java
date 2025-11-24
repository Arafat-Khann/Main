import java.util.*;
public class Activity2{
	public static void main(String [] args){
		Scanner console = new Scanner(System.in);
		int limit;
		int number;
		int sum;
		int counter;
		System.out.print("enter the number of " + " integers in the list: ");
		limit = console.nextInt();
		System.out.println();
		sum = 0;
		counter = 0;
		System.out.println("Enter " + limit+ " integers.");
		while (counter < limit) {
			number = console.nextInt();
			sum = sum + number;
			counter++;
		}
		System.out.printf("the sum of the %d "+" numbers= %d%n", limit, sum);
		if(counter != 0)
			System.out.printf("the average = %d%n", (sum/counter));
		else 		
			System.out.println("No input.");
	}
}

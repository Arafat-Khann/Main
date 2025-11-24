import java.util.Scanner;
public class Activity5 {
	public static void main(String[] args) {
		System.out.print("Enter a Number that ends with 0: ");
		Scanner input = new Scanner(System.in);
		int number;
		int max;
		number = input.nextInt();
		max = number;
		do { 
			number = input.nextInt();
			if (number > max )
				max = number;
			}while (number != 0);
		System.out.print("max is "+ max+" and number " + number);
	}
}	
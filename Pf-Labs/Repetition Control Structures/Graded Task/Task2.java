import java.util.*;
public class Task2 {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int factorial = 1;
		
		int i = 1 ;
		if (n < 0)
		{	System.out.print( "Number Can't be Negative" );}
		else {
			while( i <= n ){
					factorial = factorial * i;
		i++;
			}
				System.out.print("Factorial of "+ n + " is" + " =" + factorial);
}
	input.close();

	}
}
		

		
	

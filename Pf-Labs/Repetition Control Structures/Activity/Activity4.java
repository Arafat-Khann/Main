
import java.util.*;
public class Activity4{
	static Scanner input = new Scanner(System.in);
	public static void main(String [] args){
		int num; 
		int guess;
		Boolean done; 
		num = (int) (Math.random() * 100);
		done = false ;
		while (!done) {
			System.out.print ("Enter an integer greater"+"than or equal to 0 and "+"less than 100: ");
			guess = input.nextInt();
			System.out.println();
			if (guess == num){
				System.out.println("you guessed the "+"correct number.");
				done = true;
				}
				else if (guess < num)
					System.out.println("your guess is " + " lower than" + " the number.\n" + "Guess again!");
				else 
					System.out.println("your guess is "+" higher than" + "the number.\n"+"Guess again!");
				}
		}
}
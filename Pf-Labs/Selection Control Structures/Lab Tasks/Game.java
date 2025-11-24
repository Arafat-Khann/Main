import java.util.Scanner;
public class Task1 {
	public static void main (String[] args) {

		
		Scanner input = new Scanner(System.in);
		int computerChoice = (int)(Math.random() * 3);
		System.out.println("Enter Your choice (0 for Scissor, 1 for Rock, 2 for Paper): ");

		int userChoice = input.nextInt();
		System.out.println("computerChoice :" + computerChoice );
		System.out.println("You Choose: " + userChoice );
		
		if (userChoice == computerChoice) 
		{ System.out.println("Its a Draw"); }
		
		else if ((userChoice == 0 && computerChoice == 2) || 
		(userChoice ==1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1) )
		System.out.println("You Win");


		else {
		System.out.println("Computer Wins"); }
 
	}
}
		


		
		
	
import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a String: ");
	String s = input.nextLine();
	
	String rev = new StringBuilder(s).reverse().toString();
	if(s.equals(rev)) {
			System.out.println(s + " is a palindrome"); 
	} else {
			System.out.println(s + " is NOT a palindrome");
		}

	}
}
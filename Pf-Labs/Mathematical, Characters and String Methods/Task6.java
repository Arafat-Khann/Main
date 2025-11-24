import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input: ");
	String s = input.nextLine();
	
	int spaceIndex = s.indexOf(' ');
	String first = s.substring(0, spaceIndex);
	String second = s.substring(spaceIndex + 1);
	System.out.println("Correct Answer: " + second + " " + first);
	}
} 
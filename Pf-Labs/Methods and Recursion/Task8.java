import java.util.Scanner;
public class Task8{
	public static void main(String[] args){	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a string: ");
	String str = input.nextLine();
	

	System.out.println("Number of vowel in the String is: " + countVowels(str));
	
	}
	public static int countVowels(String str){
		int count = 0;
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) { 
			if ("aeiou".indexOf(str.charAt(i)) != -1) {
				count++;
			}
	} 
		return count;

 }
}
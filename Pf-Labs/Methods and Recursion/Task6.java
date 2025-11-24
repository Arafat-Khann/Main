import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a line of lowercase words: ");
		String line = input.nextLine();
		
		String[] words = line.split(" ");
		
		for (int i = 0; i < words.length; i++){
			words[i] =capitalize(words[i]);
		}
		for (int i = 0; i < words.length; i++){
			System.out.print(words[i] + " ");
		}
} 
		 public static String capitalize(String word) {

            if (word.length() == 0) {
            return word;
        }

        String first = word.substring(0, 1).toUpperCase();
        String rest = word.substring(1);

        return first + rest;
    }
}
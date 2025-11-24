import java.util.Scanner;

public class Task5 {	

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = input.nextLine();

        System.out.println("Number of letters: " + countLetters(text));
    } 
    
    public static int countLetters(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                count++;
            }
        }

        return count; 
    }
}

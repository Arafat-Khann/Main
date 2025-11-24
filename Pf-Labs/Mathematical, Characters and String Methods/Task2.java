import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part a: integer -> character (ASCII 0..127)
        System.out.print("Enter an ASCII code (0-127): ");
        String token = input.nextLine().trim();
        try {
            int code = Integer.parseInt(token);
            if (code < 0 || code > 127) {
                System.out.println(code + " is an invalid input");
            } else {
                char ch = (char) code;
                // printable ASCII range roughly 32..126
                if (code >= 32 && code <= 126) {
                    System.out.println("The character for ASCII code " + code + " is " + ch);
                } else {
                    System.out.println("The ASCII code " + code + " corresponds to a nonprintable control character (display suppressed).");
                    System.out.println("If you want its numeric Unicode/char value, it's: " + (int) ch);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(token + " is not a valid integer");
        }

        // Part b: character -> Unicode (code point)
        System.out.print("Enter a character: ");
        String line = input.nextLine();
        if (line.isEmpty()) {
            System.out.println("No character entered");
        } else {
            char c = line.charAt(0);
            int unicode = (int) c;
            System.out.println("The Unicode for the character " + c + " is " + unicode);
        }
    }
}

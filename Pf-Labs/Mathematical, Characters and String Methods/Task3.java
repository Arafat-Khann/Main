import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 - 15): ");
        if (input.hasNextInt()) {
            int dec = input.nextInt();
            if (dec >= 0 && dec <= 15) {
                String hex = Integer.toHexString(dec).toUpperCase();
                System.out.println("The hex value is " + hex);
            } else {
                System.out.println("invalid input");
            }
        } else {
            System.out.println("invalid input");
            input.next(); // consume bad token
        }

        System.out.print("Enter a hex digit: ");
        String hexDigit = input.next();           // read token (string)
        char c = hexDigit.charAt(0);              // take first character
        int val = Character.digit(c, 16);         // parse hex digit (base 16)
        if (val == -1) {
            System.out.println(c + " is an invalid input");
        } else {
            String bin = Integer.toBinaryString(val);
            while (bin.length() < 4) bin = "0" + bin; // pad to 4 bits
            System.out.println("The binary value is " + bin);
        }

       
    }
}

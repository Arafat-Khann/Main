import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number;

        System.out.println("Enter numbers (end with 0):");
        number = input.nextInt();

        while (number != 0) {
            count++;
            number = input.nextInt();
        }

        System.out.println("Length of sequence = " + count);
    }
}

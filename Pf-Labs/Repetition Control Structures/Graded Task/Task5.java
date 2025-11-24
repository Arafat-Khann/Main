import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter numbers (end with 0):");
        number = input.nextInt();

        while (number != 0) {
            if (number > max)
                max = number;
            number = input.nextInt();
        }

        System.out.println("Maximum number = " + max);
    }
}

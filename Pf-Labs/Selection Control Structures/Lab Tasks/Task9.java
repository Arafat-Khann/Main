import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for each coin count
        System.out.print("Enter number of pennies: ");
        int pennies = input.nextInt();

        System.out.print("Enter number of nickels: ");
        int nickels = input.nextInt();

        System.out.print("Enter number of dimes: ");
        int dimes = input.nextInt();

        System.out.print("Enter number of quarters: ");
        int quarters = input.nextInt();

        
        int totalCents = pennies * 1 + nickels * 5 + dimes * 10 + quarters * 25;

        if (totalCents == 100) {
            System.out.println("Congratulations! The total is exactly one dollar!");
        } else if (totalCents > 100) {
            System.out.println("Sorry, the amount entered is more than one dollar.");
        } else {
            System.out.println("Sorry, the amount entered is less than one dollar.");
        }
    }
}

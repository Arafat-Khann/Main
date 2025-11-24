import java.util.Scanner;
public class GradedTask3 {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);

        int SECRET = 11;
        double RATE = 12.50;

        int num1, num2, newNum;
        String name;
        double hoursWorked, wages;

        System.out.print("Enter first integer: ");
        num1 = console.nextInt();
        System.out.print("Enter second integer: ");
        num2 = console.nextInt();

        System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2);

        newNum = (num1 * 2) + num2;
        System.out.println("The value of newNum = " + newNum);

        newNum = newNum + SECRET;
        System.out.println("The updated value of newNum = " + newNum);

        System.out.print("Enter your last name: ");
        name = console.next();

        // FIX: Ask for hoursWorked and calculate wages
        System.out.print("Enter a decimal number between 0 and 70: ");
        hoursWorked = console.nextDouble();
        wages = RATE * hoursWorked;

        System.out.println("Name: " + name);
        System.out.println("Pay Rate: " + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + wages);

        console.close();
    }
}

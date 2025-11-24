import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students in class A: ");
        int a = input.nextInt();

        System.out.print("Enter number of students in class B: ");
        int b = input.nextInt();

        System.out.print("Enter number of students in class C: ");
        int c = input.nextInt();

        int totalDesks = (a + 1) / 2 + (b + 1) / 2 + (c + 1) / 2;

        System.out.println("Total desks needed: " + totalDesks);
    }
}

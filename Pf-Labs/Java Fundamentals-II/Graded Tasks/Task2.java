import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students (N): ");
        int N = input.nextInt();

        System.out.print("Enter number of apples (K): ");
        int K = input.nextInt();

        int applesPerStudent = K / N;   
        int remainingApples = K % N;     

        System.out.println("Each student gets " + applesPerStudent + " apples.");
        System.out.println("Apples remaining in basket: " + remainingApples);
    }
}

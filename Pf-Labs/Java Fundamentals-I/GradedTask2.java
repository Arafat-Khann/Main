import java.util.*;

public class GradedTask2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int length;
        int width;
        int area;

        System.out.print("Enter the length: ");
        length = console.nextInt();

        System.out.print("Enter the width: ");
        width = console.nextInt();

        area = length * width;

        System.out.println("The Area is: " + area);
    }
}

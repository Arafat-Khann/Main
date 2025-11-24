import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String s = input.nextLine();

        int first = s.indexOf('f');
        if (first == -1) {
         
        }
        int last = s.lastIndexOf('f');
        if (first == last) {
            System.out.println(first);
        } else {
            System.out.println(first + " " + last);
        }
    }
}

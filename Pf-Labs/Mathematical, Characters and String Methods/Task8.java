import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String s = input.nextLine();

        int first = s.indexOf('h');
        int last = s.lastIndexOf('h');

        if (first == -1 || last == -1 || first == last) {
            System.out.println(s);
            return;
        }

        String result = s.substring(0, first) + s.substring(last + 1);
        System.out.println(result);
    }
}

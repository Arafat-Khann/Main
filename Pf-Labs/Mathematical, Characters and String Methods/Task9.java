import java.util.Scanner;

public class Task9 {
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

        String prefix = s.substring(0, first + 1); // includes first 'h'
        String middle = s.substring(first + 1, last).replace('h', 'H');
        String suffix = s.substring(last); // includes last 'h'
        String result = prefix + middle + suffix;

        System.out.println(result);
    }
}

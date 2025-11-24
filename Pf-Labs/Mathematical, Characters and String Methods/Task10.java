import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String s = input.nextLine();
        int n = s.length();

        if (n >= 3) System.out.println(s.charAt(2)); else System.out.println();

        if (n >= 2) System.out.println(s.charAt(n - 2)); else System.out.println();

        if (n >= 5) System.out.println(s.substring(0, 5)); else System.out.println(s);

        if (n >= 2) System.out.println(s.substring(0, n - 2)); else System.out.println();

        StringBuilder even = new StringBuilder();

        for (int i = 0; i < n; i += 2) even.append(s.charAt(i));
        System.out.println(even.toString());

        StringBuilder odd = new StringBuilder();
        for (int i = 1; i < n; i += 2) odd.append(s.charAt(i));
        System.out.println(odd.toString());

        System.out.println(new StringBuilder(s).reverse().toString());

        StringBuilder everySecondReverse = new StringBuilder();
        for (int i = n - 1; i >= 0; i -= 2) everySecondReverse.append(s.charAt(i));
        System.out.println(everySecondReverse.toString());

        System.out.println(n);
    }
}

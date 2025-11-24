import java.util.Scanner;

public class Task1d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = input.nextInt();

	int i = 1;
	int sum = 0;
	while (i <= N)  {
		sum += i * i * i;
		i++;
		}

	System.out.println("Sum of cubes = " + sum);
	}
}

import java.util.Scanner;
public class Task1c {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		int sum = 0;
		int i = 0;
		
		while (i < N) {
			int num = input.nextInt();
			sum += num;
			i++;
			}

		System.out.println("Sum = " + sum);
		}
}

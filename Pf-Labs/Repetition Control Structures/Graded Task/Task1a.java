import java.util.Scanner;
public class Task1a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A: ");
		int A = input.nextInt();
		System.out.print("Enter B: ");
		int B = input.nextInt();
		
		int i = A;
		while (i <= B) {
		System.out.print(i + " ");
		i++;
		}
	}
}
	 
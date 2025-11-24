import java.util.Scanner;
public class Task1b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A: ");
		int A = input.nextInt();
		System.out.print("Enter B: ");
		int B = input.nextInt();


		if (A < B) {
			int i = A;
			while (i <= B) {
				System.out.print(i + " ");
				i++;
				}
		} else {
			int i = A;
			while(i >= B) {
				System.out.print(i + " ");
				i--;
				}
			}
	}
}

			

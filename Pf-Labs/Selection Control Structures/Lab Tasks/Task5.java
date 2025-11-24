import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Enter Three numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a == b && b == c) {
		System.out.print("3"); 
		}

		else if((a == b) || (b == c) || (c==a)) {
		System.out.print("2"); 
		}
		
		else {
		System.out.print("0");
		}
	}
}
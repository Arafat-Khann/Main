import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the value of n: ");
	int n = input.nextInt();
	
	printMatrix(n);

	input.close();
	
} 

	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int randomNum = (int)(Math.random() * 2);
				System.out.print(randomNum + " ");
			}
				System.out.println();
		}
	}
}

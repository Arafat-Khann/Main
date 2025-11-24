import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
			System.out.print("Enter how many numbers: ");
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			int count = 0;
			int i = 1;

			while (i <= n) {
			int num = input.nextInt();
				if (num == 0)  {
					count++;
}
			i++;
}

			System.out.print("number of zeros are " + count);
				input.close();
	}
}

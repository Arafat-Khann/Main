import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hours;
		int minutes;

		System.out.println("Enter number of minutes that has passed since midnight : ");

		int N = input.nextInt();
		
		hours = N/60;
		minutes = N - (hours * 60);

		System.out.println("Current time is = " + hours + ":" + minutes);
	}
}
		
import java.util.Scanner;
public class Task8 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Enter Month: ");
		int Month = input.nextInt();
		System.out.println("Enter Day: ");
		int Day = input.nextInt();
		System.out.println("Enter Year: ");
		int Year = input.nextInt();
		
		if (Month * Day == Year) {
		System.out.println("Date is Magic");
		}
		else {
		System.out.println("Date is not Magic");
		}
	}
}
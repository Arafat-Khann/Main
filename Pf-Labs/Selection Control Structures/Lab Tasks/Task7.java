import java.util.Scanner;
public class Task7 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Enter Length 1 : ");
		int Lenght = input.nextInt();
		System.out.println("Enter Width 1 : ");
		int Width = input.nextInt();
		System.out.println("Enter Lenght 2 : ");
		int Len = input.nextInt();
		System.out.println("Enter Width 2 : ");
		int Wid = input.nextInt();
		
		int Area1 = Lenght * Width; 
		int Area2 = Len * Wid;
		
		if (Area1 > Area2)
		System.out.println("Area of Rectangle 1 is greater");

		else if (Area2 > Area1)
		System.out.println("Area of Rectangle 2 is greater");

		else
		System.out.println("Both Areas Are The same");
		
	}
}
		


		

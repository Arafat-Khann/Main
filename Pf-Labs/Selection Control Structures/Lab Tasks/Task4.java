import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();

		if(a>b) {
			System.out.println(b);}
		else {
			System.out.println(a);}

		System.out.println("X = "+(a>0 ? "1" : a<1? "-1" : "0"));
		
		System.out.print("Enter Three Numbers");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		if(x>y && x>z) {
		System.out.println(" Z is the Smallest ");}
		if(y>x && z>x) {
		System.out.println(" X is the Smallest ");}
		else {
		System.out.println(" Y is the Smallest ");}
	}
}
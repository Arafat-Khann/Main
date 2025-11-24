import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Class A : ");
        int a = in.nextInt();

        System.out.print("Class B : ");
        int b = in.nextInt();

        System.out.print("Class C : ");
        int c = in.nextInt();

        System.out.print("Class D : ");
        int d = in.nextInt();

        int total = a*20 + b*15 + c*10 + d*5;

        System.out.println("Class A Total:  $" + a*20);
        System.out.println("Class B Total: $" + b*15);
        System.out.println("Class C Total: $" + c*10);
        System.out.println("Class D Total: $" + d*5);
        System.out.println("Total : $" + total);

        in.close();
    }
}


		
		  
		




		
						



import java.util.Scanner;
public class Task1{
	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number to sum digits: ");
		long n = input.nextLong();
		System.out.println("Sum of digits = " + sumDigits(n));

	        System.out.print("Enter a number to reverse: ");
		int num = input.nextInt();
		reverse(num);

		}		
	public static int sumDigits(long n) {
   		n = Math.abs(n); 
  		int sum = 0;

   		while (n > 0) {
     		sum += n % 10;  
      		n /= 10;         
    }

    return sum;
	}

	public static void reverse(int number) {
		number = Math.abs(number); // handle negative numbers
		int reverse = 0;

		while (number > 0) {
		int digit = number % 10;     
		reverse = reverse * 10 + digit;
 		number /= 10;
    }

		System.out.println(reverse);
}

}

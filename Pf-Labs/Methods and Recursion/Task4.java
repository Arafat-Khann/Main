import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Year   Days");
	System.out.println("-----------");
	
	for (int year = 2000; year<= 2020; year++) {
		System.out.println(year + "   " + numberOfDaysInAYear(year));
	}
}
	public static int numberOfDaysInAYear(int year){
		if (year % 4 == 0) {
			return 366;
			}
		else {
			return 365;
			}
	}
}
	
	
	
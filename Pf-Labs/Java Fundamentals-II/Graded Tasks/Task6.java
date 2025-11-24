import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter number of hours worked per week: ");
        double hoursPerWeek = input.nextDouble();


        double grossIncome = payRate * hoursPerWeek * 5;

        double afterTaxIncome = grossIncome - (grossIncome * 0.14);

       
        double clothes = afterTaxIncome * 0.10;

        double supplies = afterTaxIncome * 0.01;
        
        double remaining = afterTaxIncome - (clothes + supplies);
        
        double savingsBonds = remaining * 0.25;

        double parentsBonds = savingsBonds * 0.50;

       
        System.out.println("\n  Summary   ");
        System.out.printf("Income before taxes: $%.2f%n", grossIncome);
        System.out.printf("Income after taxes: $%.2f%n", afterTaxIncome);
        System.out.printf("Money spent on clothes and accessories: $%.2f%n", clothes);
        System.out.printf("Money spent on school supplies: $%.2f%n", supplies);
        System.out.printf("Money spent on savings bonds: $%.2f%n", savingsBonds);
        System.out.printf("Parents spent on additional savings bonds: $%.2f%n", parentsBonds);

        input.close();
    }
}

import java.util.Scanner;
public class SalesTax
{

  public static void main(String[] args)
  { 
   final double TAX_RATE = 0.055;
   double price;
   double tax;
   double total;
   String item;

   Scanner keyboard = new Scanner(System.in);

   System.out.print("Item description:   ");
   item = keyboard.nextLine();
   System.out.print("item price;    $ ");
   price = keyboard.nextDouble();

   tax = price * TAX_RATE;
   total = price + tax;

   System.out.print(item + "      $");
   System.out.println(price);
   System.out.print("Tax      $");
   System.out.print("tax    $");
   System.out.println(tax);
   System.out.print("Total     $");
   System.out.println(total);
  }
}

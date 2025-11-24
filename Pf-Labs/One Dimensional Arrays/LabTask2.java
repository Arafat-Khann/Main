import java.util.Scanner;
public class LabTask2 {
    public static void main(String[] args) {
    
    int[] numbers = new int[10];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 elements of array: ");
    for(int i = 0; i < numbers.length; i++) {
    numbers[i] = input.nextInt(); 
    }
     
    modify(numbers);

    System.out.println("Array after modification: ");
    for(int i =0; i < numbers.length; i++) {
        System.out.print(numbers[i] + " ");

     }
    }
    public static void modify(int[] arr) {
        for(int i = 0;i < arr.length; i++) {
            arr[i] = arr[i] * 3;
            
        }
    }
}

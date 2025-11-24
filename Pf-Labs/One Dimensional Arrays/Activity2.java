import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter array elements...");
        for(int i = 0;i< array.length;i++)
        {
            array[i]=input.nextInt();
        }
        System.out.println("Sum of the given array i....." + sum(array));
    
        input.close();
    }
    static int sum(int[] arr) {
        int s=0;
        for(int x:arr)
            s+=x;
        return s;
    }
} 

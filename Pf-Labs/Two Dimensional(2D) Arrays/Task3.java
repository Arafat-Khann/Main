import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;
public class Task3 {
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [][] array1 = new int [3][4]; 
        for(int i = 0; i < 3; i++){
            System.out.println("enter array elements of row 1 " + (i + 1));
            for(int j = 0; j < 4; j++) 
                array1[i][j] = input.nextInt();
        }
        System.out.println("The first array is....");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++)
                System.out.print(array1[i][j]+"\t");
            System.out.println();
        }
        int [][] array2 = new int[4][3];
        for(int i = 0; i < 4; i++){
            System.out.println("Enter array elements of row 2 " + (i + 1));
            for
        }
    
    }
}
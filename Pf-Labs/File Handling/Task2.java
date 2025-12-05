import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        try {
            File Obj = new File("D:\\user\\Desktop\\SEMS 1\\PF\\Lab 13\\task1.txt.");
            Scanner Reader = new Scanner(Obj); 

            int[] arr = new int[10];
            int i = 0;
             
            while (Reader.hasNextInt() && i < 10) {
                arr[i] = Reader.nextInt();
                i++;
            }
            Reader.close();

            Arrays.sort(arr);

            System.out.println("Sorted Numbers: ");
            for (int num : arr) {
                System.out.println(num);
            }
    }   
    catch (Exception e) {
        System.out.println("Error readeing file");    }   
}

}
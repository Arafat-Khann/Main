import java.io.*;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]numbers = new int[10];
        System.out.println("Enter 10 integers");
        for(int i= 0; i<numbers.length; i++) {
           numbers[i] = input.nextInt();
        } 

        try { 
            FileWriter writer = new FileWriter("D:\\user\\Desktop\\SEMS 1\\PF\\Lab 13\\task1.txt.");
            for (int num : numbers) {
                writer.write(num + "\n");
            }
            writer.close();
            System.out.println("Data Saved");


        }
        catch(IOException e){
            System.out.println("An error has occured");
        }
       
    }    

}    
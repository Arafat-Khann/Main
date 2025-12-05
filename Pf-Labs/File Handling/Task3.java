import java.io.*;
import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        try {
            File Obj = new File("D:\\user\\Desktop\\SEMS 1\\PF\\Lab 13\\task1.txt");
            Scanner Reader = new Scanner(Obj);

            int[] arr =new int[10];
            int i = 0;

            while (Reader.hasNextInt() && i < 10){
                arr[i] = Reader.nextInt();
                i++; 
            }
            Reader.close(); 

            FileWriter writer = new FileWriter("D:\\user\\Desktop\\SEMS 1\\PF\\Lab 13\\task1.txt");
            for(int j = 0; j < i; j++) {
                if (!isPrime(arr[j])) {
                    writer.write(arr[j]+ "\n");

                }
            }
            writer.close();
            System.out.println("Prime numbers Removed");

        }   catch (Exception e) {
            System.out.println("Error!");
        } 
    }

        public static boolean isPrime(int n) {
            if (n <= 1)return false;
            for (int i = 2; i<= n/2; i++) {
                if (n % i == 0) 
                    return false;
            }
            return true;
        }
    }
   
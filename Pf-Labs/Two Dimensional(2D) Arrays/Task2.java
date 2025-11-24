import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [][] array = new int [3][4]; 
        for(int i = 0; i < 3; i++){
            System.out.println("enter array elements of row # " + (i + 1));
            for(int j = 0; j < 4; j++) 
                array[i][j] = input.nextInt();
        }
        System.out.println("The given 2D array is....");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++)
                System.out.print(array[i][j]+"\t");
            System.out.println();
        }
         int maxCount = -1;
         String result = "";

          for(int i = 0; i < 3; i++) {
            int count = 0;
            for(int j = 0; j < 4; j++)
                if(isPrime(array[i][j])) count++;
            if(count > maxCount) {
                maxCount = count;
                result = "Row " + i;
            }
        }

        // check columns
        for(int j = 0; j < 4; j++) {
            int count = 0;
            for(int i = 0; i < 3; i++)
                if(isPrime(array[i][j])) count++;
            if(count > maxCount) {
                maxCount = count;
                result = "Column " + j;
            }
        }

        System.out.println("Maximum primes found in: " + result);
    }

    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }
}
    
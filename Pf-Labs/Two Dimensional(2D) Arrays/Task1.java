import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
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
        int maxRowSum = Integer.MIN_VALUE;
        int maxColSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += array[i][j];
            }

            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
        }
        int maxColIndex = -1;

        for (int j = 0; j < 4; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += array[i][j];
            }

            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIndex = j;
            }
        }


        System.out.println("\nRow with maximum sum: Row " + maxRowIndex + " (Sum = " + maxRowSum + ")");
        System.out.println("Column with maximum sum: Column " + maxColIndex + " (Sum = " + maxColSum + ")");

        input.close();

    }
}

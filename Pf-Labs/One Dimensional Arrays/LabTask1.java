import java.util.Scanner;
public class LabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ratings = new int[40];
        System.out.println("Enter 40 ratings (1 to 10):");


          for (int i = 0; i < ratings.length; i++) {
            ratings[i] = input.nextInt();
        }

        frequency(ratings);

        input.close();

    }
public static void frequency(int[] arr) {
    int[] freq = new int[11];

    for (int i = 0; i < arr.length; i++) {
        freq[arr[i]]++;
    }

    System.out.println("Frequency of ratings: ");
    for (int i =1; i <= 10; i++) {
        System.out.println(i + " = " + freq[i]);

    }

}
} 

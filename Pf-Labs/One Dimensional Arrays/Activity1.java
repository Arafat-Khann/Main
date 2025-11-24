import java.util.*;
public class Activity1{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Enter array elements: ");
        for (int i =0 ; i<array.length ; i++){
            array [i] = input.nextInt();
        }
        int largest = array [0];
        for(int i = 1; i<array.length ; i++){
            if (array[i]> largest) {
                largest = array[i];
            
            }
        }
        int largest2 ;
        if (array [0]==largest) {
            largest2 = array [1];
        }
        else 
            largest2 = array[1];
        for (int i =0 ; i<array.length; i++){
            if (array [i]!= largest) {
                if (array [i] > largest2) {
                    largest2 = array[i];
                    
                }
            } 
        }
        System.out.println("Largest= "+ largest);
        System.out.println("2nd largest= "+largest2);
        input.close();
    } 
}
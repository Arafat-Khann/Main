import java.util.Scanner;

public class Activity4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] copiedArray = new int[10];
        boolean inputDone = false;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input elements in array and display array");
            System.out.println("2. Search element and its location");
            System.out.println("3. Find largest & smallest value and place largest at index 0 and smallest at index 9");
            System.out.println("4. Copy data into another array");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Input(array);
                    display(array);
                    inputDone = true;
                    break;
                case 2:
                    if (!inputDone) {
                        System.out.println("Array not initialized yet. Please choose option 1 first.");
                    } else {
                        System.out.print("Enter element to search: ");
                        int key = sc.nextInt();
                        search(key, array);
                    }
                    break;
                case 3:
                    if (!inputDone) {
                        System.out.println("Array not initialized yet. Please choose option 1 first.");
                    } else {
                        Largest(array);
                        Smallest(array);
                        // After calling Largest and Smallest the instructions say place largest on 0th and smallest on 9th
                        int largestIndex = -1, smallestIndex = -1;
                        int largestVal = Integer.MIN_VALUE;
                        int smallestVal = Integer.MAX_VALUE;
                        for (int i = 0; i < array.length; i++) {
                            if (array[i] > largestVal) {
                                largestVal = array[i];
                                largestIndex = i;
                            }
                            if (array[i] < smallestVal) {
                                smallestVal = array[i];
                                smallestIndex = i;
                            }
                        }
                        // swap largest to index 0
                        int temp = array[0];
                        array[0] = array[largestIndex];
                        array[largestIndex] = temp;

                        // find new index of smallest (could have been affected by previous swap)
                        if (smallestIndex == 0) {
                            // smallest was at index 0 before swap, now at largestIndex
                            smallestIndex = largestIndex;
                        } else if (largestIndex == 0) {
                            // largest was at index 0 and swapped to largestIndex; smallestIndex unchanged
                        }

                        // swap smallest to last index 9
                        temp = array[9];
                        array[9] = array[smallestIndex];
                        array[smallestIndex] = temp;

                        System.out.println("Array after placing largest at index 0 and smallest at index 9:");
                        display(array);
                    }
                    break;
                case 4:
                    if (!inputDone) {
                        System.out.println("Array not initialized yet. Please choose option 1 first.");
                    } else {
                        copydata(array, copiedArray);
                        System.out.println("Copied array contents:");
                        display(copiedArray);
                    }
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Choose 1-5.");
            }
        }
    }

    // a) Input 10 elements in the array and display the array.
    public static void Input(int Array[]) {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            Array[i] = sc.nextInt();
        }
    }

    public static void display(int A[]) {
        System.out.print("Array elements: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    // b) Search element is in the array then print “Element found” along with its location.
    public static void search(int searchkey, int Array[]) {
        boolean found = false;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == searchkey) {
                System.out.println("Element found at location (index): " + i);
                found = true;
                // If you want all locations, do not break; lab text doesn't clarify; here we continue to find all
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }

    // c) Find the largest element in array.
    public static int Largest(int Array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > largest) {
                largest = Array[i];
            }
        }
        System.out.println("Largest element: " + largest);
        return largest;
    }

    // c) Find the smallest element in array.
    public static int Smallest(int Array[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < smallest) {
                smallest = Array[i];
            }
        }
        System.out.println("Smallest element: " + smallest);
        return smallest;
    }

    // d) Copy the contents of one array into another.
    public static void copydata(int Array[], int copiedArray[]) {
        for (int i = 0; i < Array.length; i++) {
            copiedArray[i] = Array[i];
        }
    }
}

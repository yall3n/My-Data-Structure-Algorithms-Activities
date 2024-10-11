import java.util.Scanner;

public class BubbleSortAscending {

    // Method to perform Bubble Sort in ascending order
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Loop through the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if the current element is greater than the next element
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Input: elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform Bubble Sort
        bubbleSort(array);

        // Output: sorted array in ascending order
        System.out.println("Array sorted in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

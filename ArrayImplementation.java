public class ArrayImplementation {
    public static void main(String[] args) {
        // Creating an integer array with 5 elements
        int[] numbers = new int[5];

        // Assigning values to the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing and printing the array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
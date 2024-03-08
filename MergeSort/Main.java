import java.util.Arrays;
/**
 * The Merge Sort program takes input and sorts values such that it separates even and odd values.
 */
public class Main {
    public static void main(String[] args) {
        // Define an array of integers
        int[] array  = {2, 5, 1, 8, 9, 12, 17, 4};

        // Separate even and odd elements into separate arrays
        int[] evenArray = Arrays.stream(array).filter(x -> x % 2 == 0).toArray();
        int[] oddArray = Arrays.stream(array).filter(x -> x % 2 != 0).toArray();

        // Print the original array
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("---------------------------------");

        // Sort even and odd arrays using merge sort
        MergeSort.mergeSort(evenArray);
        MergeSort.mergeSort(oddArray);

        // Merge sorted even and odd arrays into one sorted array
        int[] sortedArray = Arrays.copyOf(evenArray, evenArray.length + oddArray.length);
        System.arraycopy(oddArray, 0, sortedArray, evenArray.length, oddArray.length);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
}
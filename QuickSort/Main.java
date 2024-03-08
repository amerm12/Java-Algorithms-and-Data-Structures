import java.util.Arrays;
/**
 * The Quick Sort program takes input of lowecase characters, and sorts them based on ASCII Table.
 */
public class Main {
    public static void main(String[] args) {
        // Define an array of characters
        char[] characters = {'z', 'i', 'y', 'n', 'l', 'e', 'r', 'f'};

        // Print the original unsorted array
        System.out.println("Original array: " + Arrays.toString(characters));

        // Call the quickSort method from QuickSort class to sort the array
        QuickSort.quickSort(characters);

        // Print the final sorted array
        System.out.println("Sorted array: " + Arrays.toString(characters));
    }
}
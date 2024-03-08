/**
 * The QuickSort class provides methods for performing quick sort on an array of characters.
 */
public class QuickSort {
    /**
     * Initiates quick sort algorithm by calling the quickSort method with initial arguments.
     *
     * @param a The array to be sorted.
     */
    public static void quickSort(char[] a) {
        quickSort(a, 0, a.length - 1);
    }

    /**
     * Recursively sorts the given array using the quick sort algorithm.
     *
     * @param a The array to be sorted.
     * @param lowerBound The lower index of the subarray.
     * @param upperBound The upper index of the subarray.
     */
    private static void quickSort(char[] a, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int pivot = calculatePivot(a, lowerBound, upperBound);
            int pi = partition(a, lowerBound, upperBound, pivot);

            quickSort(a, lowerBound, pi - 1);
            quickSort(a, pi + 1, upperBound);
        }
    }

    /**
     * Partitions the array and places the pivot element in its correct position.
     *
     * @param a The array to be partitioned.
     * @param lowerBound The lower index of the subarray.
     * @param upperBound The upper index of the subarray.
     * @param pi The index of the pivot element.
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(char[] a, int lowerBound, int upperBound, int pi) {
        char pivot = a[lowerBound + pi];
        swap(a, lowerBound + pi, upperBound);

        int i = lowerBound - 1;

        for (int j = lowerBound; j < upperBound; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }

        swap(a, i + 1, upperBound);
        return i + 1;
    }

    /**
     * Swaps two elements in the array.
     *
     * @param a The array containing the elements.
     * @param i The index of the first element to be swapped.
     * @param j The index of the second element to be swapped.
     */
    private static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * Calculates the pivot index based on the sum of ASCII values of array elements.
     *
     * @param a The array containing the elements.
     * @param lowerBound The lower index of the subarray.
     * @param upperBound The upper index of the subarray.
     * @return The index of the calculated pivot element.
     */
    private static int calculatePivot(char[] a, int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum = sum + (int) a[i];
        }

        int aLength = upperBound - lowerBound + 1;

        int pivot = sum / aLength;
        pivot = pivot % aLength;
        return pivot;
    }
}
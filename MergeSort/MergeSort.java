/**
 * The MergeSort class provides methods for performing merge sort on an array of integers.
 */
public class MergeSort {

    /**
     * Sorts the given array using merge sort algorithm.
     *
     * @param array The array to be sorted.
     */
    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    /**
     * Recursive helper method to perform merge sort on a subarray.
     *
     * @param array The array to be sorted.
     * @param lowerBound The lower index of the subarray.
     * @param upperBound The upper index of the subarray.
     */
    public static void mergeSort(int[] array, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            mergeSort(array, lowerBound, mid);
            mergeSort(array, mid + 1, upperBound);
            merge(array, lowerBound, mid, upperBound);
        }
    }

    /**
     * Merges two sorted subarrays into one sorted array.
     *
     * @param array The array containing the subarrays to be merged.
     * @param lowerBound The lower index of the first subarray.
     * @param mid The middle index separating the two subarrays.
     * @param upperBound The upper index of the second subarray.
     */
    public static void merge(int[] array, int lowerBound, int mid, int upperBound) {
        // Calculate lengths of the two subarrays
        int leftLength = mid - lowerBound + 1;
        int rightLength = upperBound - mid;

        // Create temporary arrays to hold the elements of the two subarrays
        int[] left = new int[leftLength];
        int[] right = new int[rightLength];

        // Copy elements of the two subarrays into the temporary arrays
        for (int i = 0; i < leftLength; i++) {
            left[i] = array[lowerBound + i];
        }
        for (int j = 0; j < rightLength; j++) {
            right[j] = array[mid + 1 + j];
        }

        // Merge the two subarrays back into the original array
        int i = 0, j = 0, k = lowerBound;
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left subarray
        while (i < leftLength) {
            array[k++] = left[i++];
        }

        // Copy any remaining elements from the right subarray
        while (j < rightLength) {
            array[k++] = right[j++];
        }
    }
}
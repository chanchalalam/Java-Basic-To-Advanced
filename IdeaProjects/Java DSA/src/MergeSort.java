public class MergeSort {

    // Sorts an array of integers using the merge sort algorithm
    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) { // Base case: subarray with one element is already sorted
            return;
        }

        int mid = si + (ei - si) / 2; // Calculate the middle index

        // Divide the array into two subarrays and sort them recursively
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // Merge the two sorted subarrays
        conquer(arr, si, mid, ei);
    }

    // Merges two sorted subarrays into a single sorted subarray
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // Create an empty array to store the merged subarray
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Compare elements from both subarrays and merge them in order
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from the first subarray (if any)
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from the second subarray (if any)
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged subarray back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        mergeSort(arr, 0, arr.length - 1); // Sort the entire array

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

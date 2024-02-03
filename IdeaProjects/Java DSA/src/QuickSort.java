public class QuickSort {

    // Sorts a sub array of the given array using QuickSort algorithm
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Choose a pivot element (here, the last element)
            int pivot = partition(arr, low, high);

            // Recursively sort sub array before and after the pivot
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    // Partitions the sub array around a chosen pivot element
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];    // Choose the last element as the pivot
        int i = (low - 1);  // Index of smaller element

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (arr[j] <= pivot) {
                i++;    // Increment index of smaller element
                swap(arr, i, j);  // Swap current element with the smaller element
            }
        }
        swap(arr, i + 1, high);  // Swap the pivot with the first larger element
        return (i + 1);
    }

    // Swaps two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int i=0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}

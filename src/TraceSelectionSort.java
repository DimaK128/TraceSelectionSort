import java.util.Arrays;

public class TraceSelectionSort {

    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String RED = "\u001B[31m";

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Print the array state after each outer loop iteration
            System.out.print("Iteration " + (i + 1) + ": ");
            printArrayWithHighlight(arr, i, minIndex);
        }
    }

    public static void printArrayWithHighlight(int[] arr, int i, int minIndex) {
        for (int k = 0; k < arr.length; k++) {
            if (k == i || k == minIndex) {
                System.out.print(BOLD + RED + arr[k] + RESET + " ");
            } else {
                System.out.print(arr[k] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 13, 75, 12, 4, 18, 6, 9, 10, 7, 14, 15 };
        System.out.println("Initial array: " + Arrays.toString(arr));
        selectionSort(arr);
    }
}

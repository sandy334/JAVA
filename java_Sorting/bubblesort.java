public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// Output: Sorted Array: 11 12 22 25 34 64 90
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// This implementation of Bubble Sort sorts an array of integers in ascending order.
// It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
// The pass through the list is repeated until the list is sorted.
// Bubble Sort is a simple sorting algorithm that works by repeatedly stepping through the list, comparing adjacent elements and swapping them if they are in the wrong order.
// It is named for the way smaller elements "bubble" to the top of the list.
// Bubble Sort is not the most efficient sorting algorithm for large datasets, but it is easy to understand and implement.

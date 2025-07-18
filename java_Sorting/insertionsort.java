public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];       // Current element to insert
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;       // Insert key at correct position
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//The Insertion Sort algorithm uses one part of the array to hold the sorted values, and the other part of the array to hold values that are not sorted yet.
public class selectionsort {
    public static void main(String[] args) {
        int[] arr= {29, 10, 14, 37, 13};
        // Selection Sort
        for(int i=0; i <arr.length-1;i++){
            int min = i;
        for(int j=i+1; j<arr.length;j++){
            if(arr[j]<arr[min]);
                min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        // Print sorted array
        System.out.println("Sorted Array:");
        for(int num: arr){
            System.out.print(num + " ");

        }
    }
    
}
//explaination
//The Selection Sort algorithm finds the lowest value in an array and moves it to the front of the array.
// It then finds the next lowest value and moves it to the second position, and so on until the array is sorted.
// Selection Sort is not the most efficient sorting algorithm for large datasets, but it is easy to understand and implement.
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// This implementation of Selection Sort sorts an array of integers in ascending order.

//Write a java function to reverse an integer array int arr[] of size n using only pointer arthematic (no indexing operator [])
import java.util.*;
public class ReverseArray {
    public static void reverseArray(int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            // Swap the elements at start and end
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        reverseArray(arr, n);
        
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}


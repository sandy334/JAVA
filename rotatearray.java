//rotate array using pointers
import java.util.*;
public class RotateArray { 
    public static void rotateArray(int arr[], int n, int d) {
        d = d % n; // Handle cases where d >= n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
    }

    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
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
        
        System.out.print("Enter the number of positions to rotate: ");
        int d = sc.nextInt();
        
        rotateArray(arr, n, d);
        
        System.out.println("Rotated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
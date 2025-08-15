import java.util.*;

public class swaparray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of first array :");
        String[] input1 = sc.nextLine().split(" ");
        int[] arr1 = new int[input1.length];
        for (int i = 0; i < input1.length; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        System.out.println("Enter elements of second array :");
        String[] input2 = sc.nextLine().split(" ");
        int[] arr2 = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        int minLength = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < minLength; i++) {
            if (i % 2 == 0) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        sc.close();
    }
}

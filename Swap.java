//write a program to swap two numbers without using a third variable
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b; 
        b = a - b; 
        a = a - b; 
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}
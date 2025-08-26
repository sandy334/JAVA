//Find length of a string without using built-in functions
import java.util.*;
public class lengthofstring {
    public static int lengthOfString(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int length = lengthOfString(input);
        System.out.println("Length of the string: " + length);
    }
}
 
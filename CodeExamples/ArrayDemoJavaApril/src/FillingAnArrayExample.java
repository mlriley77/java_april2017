import java.util.Scanner;

/**
 * Created by Antonella on 4/17/17.
 */
public class FillingAnArrayExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter an integer to add to our array: ");
            int userInput = scan.nextInt();
            arr[i] = userInput;
        }
        System.out.println();

        for (int position: arr) {
            System.out.println(position);
        }
    }
}

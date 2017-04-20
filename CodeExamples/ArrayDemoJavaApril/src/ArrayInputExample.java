import java.util.Scanner;

/**
 * Created by Antonella on 4/17/17.
 */
public class ArrayInputExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        int inputSize = scan.nextInt();

        String[] userArr = new String[inputSize];

        System.out.println(userArr.length);

        System.out.println(userArr[0]);

        userArr[0] = "Antonella";

        System.out.println(userArr[0]);

    }
}

import java.util.Scanner;

/**
 * Created by Antonella on 4/18/17.
 */
public class StringBufferDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String input = scan.nextLine();

        // we passed in a string parameter to initialize a value to our buffer
        StringBuffer buff = new StringBuffer(input);

        System.out.println(buff);
    }
}


import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {


         String s = "hello";

         for (int i = 0; i < s.length(); i++) {
             System.out.print(s.charAt(i));
         }

        System.out.println(s.concat("hi"));


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = scan.nextLine();
        String checkEquality = "hello";

        System.out.println(checkEquality.equals("hi"));
        System.out.println(checkEquality.equalsIgnoreCase(input));

        System.out.println(input);

        System.out.println(input.replace('a','o'));

        System.out.println(input.substring(5));

    }
}

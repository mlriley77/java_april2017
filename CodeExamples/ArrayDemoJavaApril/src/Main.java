import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // example 1 - declaring and instantiating
        char[] arr = new char[4];

        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';

        // example 2 - declaring, instantiating and populating values
        char[] arr1 = {'a', 'b', 'c', 'd'};

        char[] arr3 = {'a', 'b', 'c', 'd'};

        Arrays.fill(arr3, 'f');

        System.out.println(arr3);

        double[] arr4 = {3.6, 7.2, 14.5, 24.7};

        // for loop to print values from the array

        for (int i = 0; i < arr4.length; i++) {

            System.out.println(arr4[i]);
        }

        System.out.println();

        // enhanced for loop / for each loop example

        for (double myValue : arr4) {
            System.out.println(myValue);
        }

        // 2 line example
        String[] arr5;
        arr5 = new String[5];

    }
}

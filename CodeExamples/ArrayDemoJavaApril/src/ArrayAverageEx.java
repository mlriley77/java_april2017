/**
 * Created by Antonella on 4/17/17.
 */
public class ArrayAverageEx {

    public static void main(String[] args) {

        double[] arr = {2.33,4.55,5.45,3.21};

        double sum1 = 0.0;

        double sum2 = 0.0;

        for (int i = 0; i < arr.length; i++) {

            // example 1 adding values to sum
            sum1 += arr[i];

            // example 2
            sum2 = sum2 + arr[i];

        }

        System.out.println("This is example 1: " + sum1/arr.length);
        System.out.println("This is example 2: " + sum2/arr.length);
    }
}

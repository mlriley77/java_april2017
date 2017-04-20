import java.util.Arrays;

/**
 * Created by Antonella on 4/17/17.
 */
public class ArrayCopyEx {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};


        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();
         //this does not copy the array it creates a reference
        // bad example -- do not do this
        int[] arr2 = arr1;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2=" + arr2[i]);
        }

        arr2[1] = 7;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1m=" + arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2m=" + arr2[i]);
        }


        int[] arr4 = Arrays.copyOf(arr1, arr1.length);
        arr4[4] = 8;

        System.out.println("aar1 after modification: ");


        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }

        System.out.println();
        System.out.println("arr2 after modification: ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]);
        }

    }
}

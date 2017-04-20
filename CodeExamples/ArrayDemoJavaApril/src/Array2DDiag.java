/**
 * Created by Antonella on 4/17/17.
 */
public class Array2DDiag {

    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4, 5},
                {1, 2, 3, 4},
                {1, 3, 2, 4},
                {1, 3, 4, 2}};

        int sum = 0;
        int i;
        int j;
        for (i= 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }


        }
        System.out.println(sum);
    }
}

/**
 * Created by Antonella on 4/17/17.
 */
public class Array2DEx {
    public static void main(String[] args) {

        int[][] arr1 = new int[5][5];

        arr1[0][0] = 3;

        int[][] arr2 = {{1, 2, 3},
                        {2, 3, 4},
                        {3, 5, 7}};

        System.out.println(arr2[0][0]);


        // jagged array
        int[][] arr3 = new int[3][];

        // string jagged array example

        String[][] titles = {{"Harry Potter", "Never Ending Story", "Lord of the Rings"},
                {"The Notebook", "Drama"}};

        String[][] arr4 = new String[3][];

        arr4[0] = new String[3];
        arr4[1] = new String[8];
        arr4[2] = new String[5];
    }
}

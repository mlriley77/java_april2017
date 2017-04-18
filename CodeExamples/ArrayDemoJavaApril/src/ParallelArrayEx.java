/**
 * Created by Antonella on 4/17/17.
 */
public class ParallelArrayEx {
    public static void main(String[] args) {
        int[] jerseyNum = {55,12,31,45,70};
        String[] names = {"mike","nick","maurice","allie", "jeremy"};
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Student Name = %s  Jersery Number = %d \n",names[i],jerseyNum[i]);

           // System.out.println();
        }
    }
}

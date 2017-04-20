import java.util.ArrayList;

/**
 * Created by Antonella on 4/18/17.
 */
public class ArrayListEx {
    public static void main(String[] args) {

        // create an arraylist of Strings

        ArrayList<String> list1 = new ArrayList<String>();

        // adding items to the arraylist
        list1.add("Saritha");
        list1.add("Lhea");
        list1.add("Sean");
        list1.add("Michael");
        list1.add("Allie");

        System.out.println("Current elements in arraylist: " + list1);

        // this is a standard fori loop
        for (int i = 0; i < list1.size() ; i++) {
            System.out.println(list1.get(i));
        }

        //for each loop -- this is doing the same thing as the loop above
        for (String loop: list1) {
            System.out.println(loop);
        }

        System.out.println();
        System.out.println(list1.get(0));

        list1.add(0,"Antonella");

        System.out.println();
        System.out.println(list1.get(0));

        list1.remove(4);

        System.out.println("Current elements in arraylist: " + list1);

    }
}

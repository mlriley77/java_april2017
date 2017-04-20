import java.util.LinkedList;

/**
 * Created by Antonella on 4/18/17.
 */
public class LinkedListEx {

    public static void main(String[] args) {
        LinkedList<String> linkl = new LinkedList<String>();

        linkl.add("Marin");
        linkl.add("Megan");
        linkl.add("Lydia");
        linkl.add("Nick");

        System.out.println("Original contents of linkedlist: " + linkl);

        for (String value: linkl) {
            System.out.println(value);
        }

        linkl.remove(2);
        System.out.println();

        for (String value : linkl) {
            System.out.println(value);
        }

    }
}

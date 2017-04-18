import java.util.Stack;

/**
 * Created by Antonella on 4/18/17.
 */
public class StackEx {

    // this data structure is LIFO
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        // add items to my stack
        st.push("bottom");
        printStack(st);
        st.push("second");
        printStack(st);
        st.push("third");
        printStack(st);

        System.out.println();
        // remove items from the stack
        String popped = st.pop();
        printStack(st);
        st.pop();
        printStack(st);
        st.pop();
        printStack(st);



    }

    public static void printStack(Stack<String> st) {

        if (st.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(st + "TOP");
        }
    }
}

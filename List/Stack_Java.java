import java.util.Stack;

public class Stack_Java {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(20);
        st.push(10);
        st.push(100);
        st.push(200);
        int top = st.peek();
        System.out.println(top);
        st.pop();
        st.insertElementAt(20, 0);

        System.out.println(st);
        // searches from top and 1 based indexing

        System.out.println(st.search(20));
    }
}

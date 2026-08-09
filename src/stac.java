import java.util.*;
public class stac {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int i=1;
        while(i<6){
            st.push(i);
            i++;
        }
        System.out.println(st);
        System.out.println(st.peek());
st.pop();
System.out.println(st);
    }
}

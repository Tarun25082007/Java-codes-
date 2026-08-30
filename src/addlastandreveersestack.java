import java.util.*;
public class addlastandreveersestack {
public static void main(String []args){
Stack<Integer> st=new Stack<>();
st.push(1);
st.push(2);
st.push(3);
st.push(4);
while(!st.isEmpty()){
    System.out.println(st.pop());
}
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    add1last(st,5);
    while(!st.isEmpty()){
        System.out.println(st.pop());
    }

    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    reverse(st);
    while(!st.isEmpty()){
        System.out.println(st.pop());
    }
}
public static void reverse(Stack<Integer> st){
    if (st.isEmpty()){
        return;
    }
    int temp = st.pop();
     reverse(st);
     add1last(st,temp);
     // pushing at bottom
}
public static void add1last(Stack<Integer> st,int n){
    if (st.isEmpty()){
        st.push(n);
        return;
    }
    int temp = st.pop();
    add1last(st,n);
    st.push(temp);
}

}

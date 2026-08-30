import java.util.*;
// using linked list
// the logic is easier with array list we dont need node par
public class stackk {
    // commomn for all
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
        // node head not need for arraylist
        public static Node head;
        // we initialise a public static arraylist then continue  rest use arraylist logic
        public static boolean isEmpty(){
            return head == null;
        }
        // head under anything which is datatype its an instanve
        public void push(int data){
            Node curr = new Node(data);
            if (isEmpty()) {
                head = curr;
                return;
            }
            curr.next = head;
            head = curr;
        }
        public int pop(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return 0;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        int data = head.data;
        return data; }}
public static void main (String[]args){
Stack s = new Stack();
//Stack<Integer> d = new Stack<>(); this  is for nor aml
// everthing is static or else i am facing issue
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4); int x = s.pop();
    s.push(5);
    s.push(6);
    int y = s.peek();
}
}

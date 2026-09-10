import java.util.*;
public class llqueue {
    public static class Node {
       public  int data;
       public  Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }public static class queue{
      public  static  Node head;
      public static   Node tail;

    public static void push(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public static void pull() {
        if (head == null){
            System.out.println("queue is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        } head = head.next;

    }
    public static int   peek(){
        if (head == null){
            System.out.println("queue is empty");
            return -1;
        }

        return head.data;


    }}
    public static void main (String[] args) {
        queue obj = new queue();
        //Queue <datatype> variable name = new LinkedList<>();
        //Queue <datatype> variable name = new ArrayDeque<>();
        obj.pull();
        obj.push(1);
        obj.push(2);
        obj.pull();
        obj.push(3);
        obj.peek();

    }
}

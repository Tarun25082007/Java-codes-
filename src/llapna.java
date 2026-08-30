import org.w3c.dom.Node;

import java.util.*;
// all ths was the logic which  runs only in background now next one i will write only the builtin ones
public class  llapna {
    Node head;
    private int size = 0;
    class Node {
        String data;
        Node next ;
        Node(String data) {
            this.data = data;
            this.next = null;
            //beginning it sld be nulll only

        }}
    public void addfirst(String data) {
        Node newNode= new Node(data) ;
        if (head == null){
            head =newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
size++;
    }
    public void addlast(String data){
        Node newNode =new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        Node currnode=head;
        while(currnode.next != null){
            currnode=currnode.next;
        }
        currnode.next=newNode;
        size++;

    }
    public void printlist(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currnode = head;
        while (currnode != null){
            System.out.println(currnode.data+ " ");
            currnode=currnode.next;
        }
        System.out.println("null");
    }
    public void deletefirst(){
        if (head == null){
            System.out.println("list is empty");
        return;
        }
        head =head.next;
        size--;
        //shifts head to next
    }
    public void deletelast(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node lastnode = head.next;
        Node currnode = head;
        while (lastnode.next != null){
            lastnode=lastnode.next;
            currnode=currnode.next;
        }
        currnode.next=null;
        size--;
    }
public int getsze(){
        return size;
}
// 3 pointer method
    public  void reverse(){
        if  (head == null){
            System.out.println("list is empty");
            return;
        }
        if (head.next==null){
            System.out.println("only sigle element");
            return;
        }
        Node prev =head;
        Node curr = head.next;
         while (curr != null){
             Node next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
         head.next=null;
         head=prev;

    }
    //stact rrecursion method
    public Node recurreverse(Node head){
        if (head == null || head.next == null){
            return(head);
        }
        Node newhead = recurreverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public static void main (String[] args) {
        llapna list1 = new llapna();
        list1.addfirst("hi");
        list1.addfirst("hii");
        list1.addfirst("hiii");
        list1.addfirst("hiiii");
        list1.printlist();
        System.out.println("REVERSED");
        list1.reverse();
        list1.printlist();
       list1.head= list1.recurreverse(list1.head);
        list1.printlist();
        // System.out.println(list1.size);//if size is public

    }
}
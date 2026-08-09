import java.util.*;
public class linklist {
    public static void main(String[] args) {
        Queue <Integer> ll = new LinkedList<>();
        ll.offer(1);
        ll.offer(2);
        ll.offer(3);
        System.out.println(ll.peek());
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);
    }
}

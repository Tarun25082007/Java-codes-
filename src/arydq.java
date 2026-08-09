import java.util.ArrayDeque;
import java.util.HashSet;

public class arydq {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        q.offerFirst(4);//gets stored in head
        System.out.println(q);
        q.offerLast(5);
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);
        q.pollLast();
        System.out.println(q);

    }
}

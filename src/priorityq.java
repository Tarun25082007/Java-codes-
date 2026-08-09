import java.util.*;
public class priorityq {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q);
        q.clear();
        q.offer(3);
        q.offer(2);
        q.offer(1);
        System.out.println(q.peek());
        System.out.println(q);
        q.clear();
        q.offer(0);
        q.offer(6);
        q.offer(1);
        q.offer(4);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        Queue<Integer> qp = new PriorityQueue<>(Comparator.reverseOrder());
        qp.offer(1);
        qp.offer(2);
        qp.offer(3);
        System.out.println(qp.peek());
        System.out.println(qp);
        qp.clear();
        qp.offer(3);
        qp.offer(2);
        qp.offer(1);
        System.out.println(qp.peek());
        System.out.println(qp);
        qp.clear();
        qp.offer(0);
        qp.offer(6);
        qp.offer(1);
        qp.offer(4);
        System.out.println(qp);
        qp.poll();
        System.out.println(qp);
    }
}

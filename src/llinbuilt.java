import java.util.*;
public class llinbuilt {
    public static void main(String[] args) {
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.addFirst(2);
        list2.addLast(3);
        list2.add(0,4);
        list2.size();
        System.out.println(list2.get(1));
        list2.removeFirst();
        list2.removeLast();
        list2.remove(1);
        list2.remove(0);
        list2.add(0,5);
        list2.remove(Integer.valueOf(5));
        System.out.println(list2);
        Iterator itr = list2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for( int i : list2){
            System.out.println(i);
        }
        Collections.reverse(list2);
        System.out.println(list2);
        LinkedList list1 = new LinkedList();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);
    System.out.println(list1);
    Collections.reverse(list1);
    System.out.println(list1);

    }

}

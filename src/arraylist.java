import java.util.*;
public class arraylist {
public static void main(String[] args) {
ArrayList<Integer> al = new  ArrayList<>();
al.add(1);
al.add(2);
al.add(3);
al.remove(2);
al.add(0,3);
Iterator<Integer> it = al.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}
al.remove(Integer.valueOf(1));
al.set(0,2);
al.get(1);
for (int i : al) {
System.out.println(i);
}

}
}
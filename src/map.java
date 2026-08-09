import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
        map.remove(1);
        System.out.println(map);
    }
}
// trees will be same so but its just in binary like (logn)
//linked is just sorted stuff

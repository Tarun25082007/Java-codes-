import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();
        }
        freck(arr,n);
    }
    public  static void freck(Integer[] arr,int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {map.put(arr[i],0);}
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                //this will update the existing value as there cant be 2 entry with similar key
                //this is o(n) which beats the o(n2)
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.print(entry+" ");
        }
    }
}

import java.util.*;
public class basic2 {
    public static void main(String[] args){
//    final int a=2;
//    System.out.println(a);
//    System.out.println("hi!\t hi\\ hi\n hi\"");
//    Scanner sc=new Scanner(System.in);
//    int b=sc.nextInt();
//    System.out.println(b>=4?"hi":"bi");
//    System.out.println(a==b?"hi":"bi");


        System.out.println("enter size");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String[] ary=new String[a];
        for(int i=0;i<a;i++){
            ary[i]=sc.nextLine();
        }
        System.out.println();
        for(int i=0;i<a;i++){
            System.out.println(ary[i]);
        }

    }
}

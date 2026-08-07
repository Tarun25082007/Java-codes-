import java.util.*;
public class bit {
    public static void  main(String[] args) {
        // to coveert bit at given intpositionn  to another like 0 to 1 or one to 0
        int num,pos,i;
        System.out.println("enter num");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("enter pos stats ");
        pos=sc.nextInt();
        i=1<<(pos-1);
        if((num & i) >0)
            fuc0(num, i);
        else
            fuc1(num,i);
    }
    public static void fuc0(int x,int y){
        y = ~y;
        System.out.println((y & x));
        System.out.println(y);
    }
    public static void  fuc1(int x,int y){
        System.out.println((y | x));
    }
}

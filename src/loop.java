import java.util.*;
public class loop {
    public static void main(String[] args){
//        for(int i =1;i<10; ++i){
//            System.out.println(i);
//        }
//        int a=1;
//        while(a<=10){
//            a+=1;
//            System.out.println(a);
//
//        }
//        int b=1;
//        do {
//            b+=1;
//            System.out.println(b);
//
//
//        }while(b<
//                10);
//        System.out.println("enter the number till which u need sum");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int sum=0;
//        int b=0;
//        while(b<=a){
//            sum+=b;
//            b+=1;
//        }
//        System.out.println(sum);
        System.out.println("enter the number whose tables u want");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1, j=2;i<=a && j>0;i++,j--,j++){
            System.out.println(a+"*"+"="+(a));
        }
    }
}

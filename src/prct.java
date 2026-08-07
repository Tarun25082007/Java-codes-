import java.util.*;
public class prct {
    public static void main(String[] args) {
//        System.out.println("to check palindrome or not");
//        System.out.println("enter num");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a = 0;
//        int b=0;
//        int c = n;
//        while (n>0){
//            a=n%10;
//            b=(b*10)+a;
//            n=n/10;
//        }
//        if (c==b){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }

//        System.out.println("to find sum of digits");
//        System.out.println("enter num");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a = 0;
//        int b=0;
//        while (n>0){
//            a=n%10;
//            b+=a;
//            n=n/10;
//        }
//            System.out.println(b);

        System.out.println("limit");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i = 1;
        while (i <= limit) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i+=1;
        }
    }
}

import java.util.Scanner;

public class recurfibonoci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,n-2);
    }
    public static void fibo(int a,int b,int n){
        if(n>0){
        System.out.println(a+b);
        fibo(b,a+b,n-1);
        }
    }
}

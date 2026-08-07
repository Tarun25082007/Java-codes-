import java.util.*;
public class pairandsingle {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(call(n));
    }
    public static int call(int n){
        if (n<=1){
            return 1;
        }
        int x=call(n-1);
        int y=(n-1)*call(n-2);
        // here we multiply with n-1 so as we the one we removed above except that we can pair with anything right thats why remaining options is n-1
        // call n-1 or n-2 explains how many ppl are removed and we mutilpy with n-1 on combinations on how its removed
    return x+y;
    }
}

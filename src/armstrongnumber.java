import java.util.*;
public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int ln=String.valueOf(n).length();
        int sum =0;
        while (m>0){
            sum+=Math.pow(m%10,ln);
            m/=10;
        }

        if (n==sum) {
            System.out.println("The number is armstrong ");
        }else{
            System.out.println("It is not armstrong ");
        }

    }
}

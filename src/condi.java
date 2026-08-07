import java.util.*;
public class condi {
    public static void main(String[] args){
        System.out.println("to check odd or equal");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a =sc.nextInt();
        System.out.println("enter a number");
        int b =sc.nextInt();
        if(a==b){
            System.out.println("the equal number");
        }
        else if (a > b) {
                System.out.println("the smaller number ");
                System.out.println(b);
            } else {
                System.out.println("the bigger number");
                System.out.println(a);
            }
    }
}

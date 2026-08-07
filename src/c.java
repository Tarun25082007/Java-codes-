import java.util.*;
public class c {
    public static void main(String[] args) {
        int x,i,y;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter bit position ");
        i = sc.nextInt();
        y=1<<i-1;
        if ((x & y) != 0 ){
            System.out.println("the value at pos is 1" );
            System.out.println("now we switch ");
            x=x&~y;
            System.out.println("the values of x "+ x);
        }
        else { System.out.println("the value at pos is 0" );
            System.out.println("now we switch ");
            x=x|y;
            System.out.println("the values of x "+ x);

        }
    }
}

import java.util.*;
public class maze {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        maze(0,0,n,m);
        System.out.println(count);

    }
    public static int count =0;
    public static void  maze(int n,int m,int a,int b){

        if (n==a && m==b){
            count++;
            return ;
        }
        else if (n>a || m>b){
            return;

        }
            maze(n + 1, m,a,b);

            maze(n, m + 1,a,b);

    }

}


import java.util.*;

public class tiles {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=m;
            maze(1,x,n,m);
            System.out.println(count);

        }
        public static int count =0;
        public static void  maze(int n,int m,int a,int b){
            if (a<0 || b<0){
                return;

            }

            if (0==a){
                count++;
                return ;
            }

            maze(n, m,a-1,b);

            maze(n, m,a-m,b);

        }

    }




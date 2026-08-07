import java.util.*;

public class subset {

        //its like permutation but in same sequece lik ur choice rmovoe har or lleavea it
        public static void  main(String args[]){
            Scanner sc=new Scanner(System.in);
            int  n=sc.nextInt();
            HashSet<Integer> h=new HashSet<>();
            sub(1,n,h);
        }
        public static void sub(int k,int n,HashSet<Integer> h){
            if (k>n){
                System.out.println(h);
                return;
            }
            // to add the integer in subset
            h.add(k);
            sub(k+1,n,h);
            // the not add achar in subset
            h.remove(k);
            sub(k+1,n,h);

        }
    }


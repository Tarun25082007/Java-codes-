import java.util.*;
public class hashset {
        //its like permutation but in same sequece lik ur choice rmovoe har or lleavea it
        public static void  main(String args[]){
            Scanner sc=new Scanner(System.in);
            String  n=sc.nextLine();
            HashSet<String> set=new HashSet<>();
            sub(n,0,"",set);
        }
        public static void sub(String n,int k,String h,HashSet<String> set){
            if (k==n.length()){
                if (set.contains(h)){
                    return;} else  {
                    set.add(h);
                    System.out.println(h);
                    return;

                }
            }
            char ch=n.charAt(k);
            // to add the char
            sub(n,k+1,h+ch,set);
            // the char is not there
            sub(n,k+1,h,set);
        }
    }



import java.util.*;

public class subsequence {
    //its like permutation but in same sequece lik ur choice rmovoe har or lleavea it
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        String  n=sc.nextLine();
        StringBuilder s=new StringBuilder();
        s.append(n);
        sub(s,0,"");
    }
    public static void sub(StringBuilder n,int k,String h){
 if (k==n.length()){
     System.out.println(h);
     return;
 }
 char ch=n.charAt(k);
 // to add the char
 sub(n,k+1,h+ch);
 // the char is not there
  sub(n,k+1,h);

    }
}

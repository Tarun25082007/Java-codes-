import java.lang.module.FindException;
import java.util.*;

public class duprcurstr {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        reucr(str1,0);}
//    rather than all this just create a booleann array  which with length 26 thn whn u check u just check the index
//    if index is false thn append then and turn to true if true move to next char good logic

    public static void reucr(String str,int n){

        if(sb.isEmpty()){// is empty is beet that lenght ==0
            sb.append(str.charAt(n));
            reucr(str,n+1);
        }

        else if (n>str.length()-1){
            System.out.println(sb);
        }
       else  if (sb.indexOf(String.valueOf(str.charAt(n)))==-1){//i cannot use sb.index(charat) as for string builder i need string so i use string.value of to covert it yo sting
            sb.append(str.charAt(n));
            reucr(str,n+1);
        }
        else {
            reucr(str,n+1);}

    }
}

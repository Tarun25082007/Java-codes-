import java.util.*;
//FIRST AND LAST OCCURENCE
public class prsscticeconti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder x=new StringBuilder();
     System.out.println("enter the string ");
        String s=sc.nextLine();
        x.append(s);
        move(x,0);

    }
    // I swapped in a string and apna college just created a new string in next problem reomve duplicates I will use her method
    public static void move(StringBuilder x,int i){
        int k=i;
        if (i==x.length()-1){
            System.out.print(x);
        }
        while(k<x.length()){
            if (x.charAt(k)=='x'){
                k++;
            }
            else{
                char temp=x.charAt(k);
                x.setCharAt(k,x.charAt(i));
                x.setCharAt(i,temp);
                break ;
            }



        }
        if (i<x.length()-1){
            move(x,i+1);
        }
    }
}

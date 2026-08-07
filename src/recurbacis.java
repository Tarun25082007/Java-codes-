import java.util.Scanner;

public class recurbacis {
    public static void main(String[] args) {
        Scanner sxc= new Scanner(System.in);
        int x= sxc.nextInt();
       System.out.println( recur(x));
    }
    public static int recur(int x){
//        if(x==0){
//            return y;
//        }
//        y*=x;
//        return recur(x-1,y);
        if(x==0 || x==1){
            return 1;
        }
        return x*recur(x-1);


    }
}

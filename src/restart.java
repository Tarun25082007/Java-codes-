import java.util.Scanner;
//this a problem of recursion witth logn
public class restart {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        System.out.println("enter the value of y");
        int y=sc.nextInt();
       System.out.println(recur(x,y));
    }
    public static int recur(int x,int y){
        if(x==0){
            return 0;
        }
        if(y==0){
            return 1;
        }
        if(y % 2==0){
            return recur(x,y/2)*recur(x,y/2);
        }
        else{
            return recur(x,y/2)*recur(x,y/2)*x;
        }


    }
}

import java.util.Scanner;

public class towerofhanoi {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height of x");
        int x=sc.nextInt();
        hanoi(x,"s","h","d");
    }
    public static void hanoi(int x,String s,String h,String d)
    {
        if(x==1)
        {
            System.out.println("transfer of "+x+" from "+s+" to "+d);
        }
        else{
        hanoi(x-1,s,d,h);
        System.out.println("transfer of "+x+" from "+s+" to "+d);
        hanoi(x-1,h,s,d);
    }}
}

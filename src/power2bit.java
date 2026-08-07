import java.util.Scanner;

public class power2bit {
    public static void main(String[] args)
    {
        int num,count1=0;
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0)
        {

            if((num&1)==1)
             count1++;
            num=num>>1;
        }
        if (count1==1 )
            {
            System.out.println("The power is power of 2 ");
            }
        else {
            System.out.println("The power is not power of 2 ");
        }
    }
}

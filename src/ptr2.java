import java.util.Scanner;

public class ptr2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter height ");
        int n=sc.nextInt();
        for  (int i=1;i<=n/2;i++){
            for(int j=0;j<=(n/2)-i;j++){
               System.out.print(" ");
            }
            for(int j=0;j<i+i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        if (n%2!=0){
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n/2;i>=1;i--){
            for (int j=(n/2)-i;j>=0;j--){
                System.out.print(" ");
            }
            for (int j=0;j<i+i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }



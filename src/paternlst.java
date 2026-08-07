import java.util.Scanner;

public class paternlst {
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ending char");
        char n=sc.next().charAt(0);
        for(char j='A';j<=n;j++){
            for (char k='A';k<=j;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}


import java.util.*;
public class decitobinary {
    public static void main(String [] args){
        System.out.println("enter 1 to convert deci to bi or 2 for vice versa");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a){
            case 1: decitobi();
                    break;
            case 2: bitodeci();
                break;
            default : System.out.println("invalid input");
                break;
        }
    }
    public static void decitobi(){
        System.out.println("enter num");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Integer.toBinaryString(a));
    }
    public static void bitodeci(){
        System.out.println("enter num");

        try{
            Scanner sc=new Scanner(System.in);
        int a =sc.nextInt(2);
            System.out.println(a);}
        catch(InputMismatchException e){
            System.out.println("invalid input");
        }

    }
}

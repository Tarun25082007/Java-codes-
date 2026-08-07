import java.util.*;
public class calc {
    public static void main(String[] args){
        System.out.println("calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number on which op r performed");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the op to be performed\n1.add\n2.sub\n3.mul\n4.div");
        int c=sc.nextInt();
        switch(c){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:{
                if(b>0) {
                    System.out.println(a / b);
                }
                else{
                    System.out.println("dont ente b as 0");
                }
            break;
            }

        }
    }
}

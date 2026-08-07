import java.util.*;
public class swi {
    public static void main(String[] args){
        System.out.println("choose in which lang to print\n1. english\n2.hindi\nfrench");
        Scanner sc = new Scanner(System.in);
        char x=sc.next().charAt(0);
        switch(x) {
            case 'a':{
                System.out.println("hello");
                System.out.println("hello");}
                break;
            case 'b':
                System.out.println("namaste");
                break;
            case 'c':
                System.out.println("bojour");
                break;
            default:
                System.out.println("error");
        }
    }
}

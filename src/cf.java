import java.util.*;
public class cf {
    public static int solu(int a,int b,int c) {
        String m = " ";
        String mi = " ";
        int x=0;
        while(true)
        {
            if (a==b || b==c || c==a){
                break;
            }
             if(a>b && a>c){
                  m ="a";
             }
             else if(b>a && b>c){
                  m ="b";
             }
             else {
                  m ="c";
             }
            if(a<b && a<c){
                 mi ="a";
            }
            else if(b<a && b<c){
                 mi ="b";
            }
            else {
                mi ="c";
            }
            switch (m){
                case "a":a-=1;
                break;
                case "b":b-=1;
                break;
                case "c":c-=1;
                break;

            }
            switch (mi){
                case "a":a+=1;
                    break;
                case "b":b+=1;
                    break;
                case "c":c+=1;
                    break;

            }


            x++;


        }
        return x;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
        int n = input.nextInt();
        int m = input.nextInt();
        int a=input.nextInt();
        System.out.println(solu(n,m,a));
    }}
}

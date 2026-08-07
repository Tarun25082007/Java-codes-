import java.util.*;
public class abcpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        for(int i=0;i<=a-'a';i++){
            for (int  j=a-'a'-i;j>0;j--){
                System.out.print(' ');
            }
            for(char j=(char)('a'+i);j>='a';j--){
                System.out.print(j);
            }
            for (char j='a'+1;j<=(char)('a'+i);j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

import java.util.*;
public class advpatrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
//        int t = sc.nextInt();
//        int n = t * 2;
//        int a = n;
//        for (int i = 0; i <= n; i++) {
//            if (i <= (n / 2) || i <= ((n + 1) / 2)) {
//                if (i > 0) {
//                    a -= 2;
//                }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }+
//                for (int k = 1; k <= a; k++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//            } else {
//                if (i > 0) {
//                    a += 2;
//                }
//                for (int j = 1; j <= (n - i); j++) {
//                    System.out.print("*");
//                }
//                for (int k = 1; k <= a; k++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= (n - i); j++) {
//                    System.out.print("*");
//                }
//            }
//                if (true &&  i == (n / 2)) {
//                    System.out.println();
//                    for (int j = 1; j <= n; j++) {
//                        System.out.print("*");
//                    }
//                }
//
//                System.out.println();
//
//
//        }
    int l =sc.nextInt();
    int b=2*l;
//    for(int i=1;i<=l;i++){
//        b-=1;
//        for (int j=b;j>0;j--){
//            System.out.print(" ");
//        }
//        for (int j=1;j<=l;j++){
//            System.out.print("*");
//        }
//    System.out.println();
//    }
//        for(int i=1;i<=l;i++){
//            b-=1;
//            for (int j=1;j<=b;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=l;i++){
//            b-=2;
//            for (int j=1;j<=l-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            for (int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//
//            System.out.println();
//        }
        int a =1;
        int h=1;
        for(int i=1;i<=l+1;i++){
            if (i<=(l/2) || i<=((l+1)/2) ){
                for (int j = 0; j <= ((1+l)/2) - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= a; j++) {
                    System.out.print("*");
                }
                a += 2;
            }if ((l%2!=0) && i==((l+1)/2)){
                System.out.println();
                for  (int j = 1; j <=a; j++) {
                    System.out.print("*");
                }
            }
            else if( i>((l+1)/2)){
                a-=2;
                for (int j = 1; j <=h; j++) {
                System.out.print(" ");
            }
            h+=1;if (a==(l+2)){a=a-2;}
                for (int j = 1; j <= a; j++) {
                    System.out.print("*");
                }

            }

            System.out.println();
        }
    }

}
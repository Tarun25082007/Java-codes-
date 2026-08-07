import java.util.*;
public class patteern {
    public static void main(String[] args){
        System.out.println("enter l and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c=b;
//        int b = sc.nextInt();
//        for (int i=1;i<=a;i++){
//            for (int j=1;j<=b;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i=1;i<=a;i++){
//            for (int j=1;j<=b;j++){
//                if (i==1){
//                    System.out.print("*");
//                }
//                else if (i==a){
//                    System.out.print("*");
//                }
//                else{
//                if (j==1){
//                    System.out.print("*");
//                        }
//                else if (j==b){
//                            System.out.print("*");
//                        }
//                else{
//                            System.out.print(" ");
//                        }
//
//                    }
//                }
//            System.out.println();
//            }

//        for (int i=1;i<=a;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        
//        for (int i=a;i>0;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//        for (int i=a;i>0;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//        for (int i=1;i<=a;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//        for (int i=1;i<=a;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(b);
//                b+=1;
//            }
//
//        for (int i=1;i<=a;i++){
//            for (int j=1;j<=i;j++){
//                if(i%2==0){
//
//                    if (j%2==0){
//                        System.out.print("1");
//                    }
//                    else{
//                        System.out.print("0");
//                    }
//                }
//                else{
//                    if (j%2==0){
//                        System.out.print("0");
//                    }
//                    else{
//                        System.out.print("1");
//                    }
//                }
//            }
        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
//                if(j>=c){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//
//            }
//            c-=1;
                if(j<=(b-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }


            }
            System.out.println();
        }

    }

    }



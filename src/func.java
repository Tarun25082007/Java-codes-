import java.util.Scanner;
//public class func {
//    public static int funcex(int x,int y) {
//        return (x*y);
//    }
//
//    public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//int a=sc.nextInt();
//int b=sc.nextInt();
//int c=funcex(a,b);
//System.out.println(c);
//    }
//}

//public class func {
//    public static int funcex(int x) {
//        int z=1;
//        for (int i = 1; i <= x; i++) {
//            z=z*i;
//        }
//        return (z);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        System.out.println(funcex(a));
//    }
//}

//public class func {
//    public static int funcex(int x,int y) {
//        return (x/y);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("how many");
//        int a=sc.nextInt();
//        int c=0;
//        System.out.println("enter num");
//        for(int i=1;i<=a;i++) {
//            int b = sc.nextInt();
//            c=c+b;
//        }
//        System.out.println(funcex(c,a));
//    }
//}

//public class func {
//    public static int funcex(int x) {
//        int z=0;
//        for (int i = 1; i <= x; i++) {
//            if (i % 2 != 0) {
//                z=z+i;
//            }
//        }
//        return (z);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter limit odd");
//        int a=sc.nextInt();
//        System.out.println(funcex(a));
//    }
//}

//public class func {
//    public static int funcex(int x,int y ) {
//            if (x>y) {
//                return x;
//            }
//            else if (y>x) {
//                return y;
//            }
//            else{
//               return (0);
//            }
//        int z;
//        z=(x==y)?0:((x>y)?x:y);
//        return z;
//        }
//
//
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println(funcex(a,b));
//    }
//}

//public class func {
//    public static double funcex(int x) {
//        final float pi=3.14f;
//        return (Math.PI*x*x);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter limit odd");
//        int a=sc.nextInt();
//        System.out.println(funcex(a));
//    }
//}


//public class func{
//    public static void main(String[] args){
//        do{
//            System.out.println("hi");
//
//        }while(true);
//    }
//}
//public class func{
//public static double funcex(double x,double y) {
//    double z=Math.pow(x,y);
//    return(z);
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("num");
//    int a =sc.nextInt();
//    System.out.println("pow");
//    int b =sc.nextInt();
//    System.out.println(funcex(a,b));
//}
//}

//public class func{
//    public static float funcex(float x,float y) {
//        float z=(x>y)?y:x;
//        float gf=0;
//        for(int i=1;i<=z;i++){
//            if (x%i==0 && y%i==0){
//                gf=i;
//            }
//        }
//        return gf;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("num1");
//        float a =sc.nextFloat();
//        System.out.println("num2");
//        float b =sc.nextFloat();
//        System.out.println("the greatest  divisor is " +funcex(a,b));
//    }
//}

//public class func {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter limit");
//        int a = sc.nextInt();
//        int b = 0;
//        int c = 1;
//        int d = 0;
//        while (b <= a) {
//


//            b = b + d;
//            d = c;
//            c = b;
//            System.out.println(b);
//        }
//    }
//}

public class func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit");
        int a = sc.nextInt();
        int cpos=0;
        int bneg=0;
        int dzer=0;
        for(int i=1;i<=a;i++){
        int b =sc.nextInt();
        if(b>0){
            cpos++;
        }
        else if(b<0){
            bneg++;
        }
        else{
            dzer++;
        }
        }
        System.out.println(cpos);
        System.out.println(bneg);
        System.out.println(dzer);

    }
}

//public class teycatch {
//    public static void main(String[] args){
//        try{
//            System.out.println("hi");
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//
//        catch (ArithmeticException end){
//            System.out.println(end);
//        }
//        System.out.println("continue" );
//    }
//}

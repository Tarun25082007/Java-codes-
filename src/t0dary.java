import java.util.*;
public class t0dary {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter row");
    int a =sc.nextInt();
    System.out.println("enter column");
    int b =sc.nextInt();
    System.out.println("enter value");
        int[][] z = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
               z[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(z[i][j]+" ");

            }System.out.println();}
//        int num=3;
//        System.out.println("enter the number to be found");
//        int c=sc.nextInt();
//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++){
//                if(c==z[i][j]){
//                    System.out.printf("%d  %d\n",i,j);
//                    num=2;
//                    break;
//                }
//                else {
//                    num=1;
//
//                }
//
//                }
//            }
//        if(num==1){
//            System.out.println("the number is not found");
//        }
//        System.out.println("transpose is ");
//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++){
//                System.out.print(z[j][i]+" ");
//            }
//            System.out.println();
//        }
//        int sum=0;
//for(int i=0;i<a;i++){
//for(int j=0;j<b;j++){
//    sum+=z[j][i];
//    sum+=z[i][j];
//}
//System.out.println(sum);
//sum=0;
//}


//        int temp=0;
//        for(int i=0;i<a;i++){
//            for(int j=i;j<b;j++){
//temp=z[i][j];
//
//z[i][j]=z[j][i];
//z[j][i]=temp;
//            }
//        }
//
//for(int i=0;i<a;i++){
//    for(int j=0;j<b;j++){
//        System.out.print(z[i][j]+" ");
//    }System.out.println();
//}



//        int temp=0;
//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++){
//                if(z[i][j]==z[j][i]){
//                    temp=0;
//                }
//else{
//    temp=1;
//    break;
//                }
//
//            }
//        }
//
//      if(temp==0){
//          System.out.println("nyes");
//      }
//      else{
//          System.out.println("no");
//      }

//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++){
//                if(i==0 || i==a-1 || j==0 || j==b-1){
//                    System.out.print(z[i][j]+" ");
//                }
//                else{
//                   System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }

//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++){
//                if(i==j || (i+j)==a-1){
//                    System.out.print(z[i][j]+" ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }



//boolean f=true;
//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++){
//                if(i==j && z[i][j]!=1){
//                    f=false;
//                    break;
//
//                }
//                else if(i!=j && z[i][j]!=0){
//                    f=false;
//                    break;
//                }
//
//            }
//
//        }
//if (f){
//    System.out.println("identitiy");
//}
//else{
//    System.out.println("no identitiy");
//}

//int cnum=0;
//        int rnum=0;
//                int sum=0;
//        int sum1=0;
//        int max=0;
//        int cmax=0;
//for(int i=0;i<a;i++){
//for(int j=0;j<b;j++){
//    sum+=z[i][j];
//    sum1+=z[j][i];
//}
//if (sum>max){
//    max=sum;
//    rnum=i;
//}
//if (sum1>cmax){
//    cmax=sum1;
//    cnum=i;
//}
//sum=0;
//sum1=0;
//}
//System.out.println("row num"+(rnum+1));
//System.out.println("row mmax "+max);
//System.out.println("column num "+(cnum+1));
//System.out.println("column mmax "+cmax);


//        int num0=0;
//        int num=0;
//
//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++) {
//
//                if (z[i][j] == 0) {
//                    num0++;
//                } else {
//                    num++;
//                }
//            }
//        }
//        if (num0>num){
//        System.out.println("sparse");}
//        else if (num0<num){
//        System.out.println("no sparce ");}
//        else{
//            System.out.println("idk sparse ");
//        }


//        int max=0;
//        int max2=0;
//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++) {
//
//                if (z[i][j] > max) {
//                    max2=max;
//                    max = z[i][j];
//                }
//                else if (z[i][j]>max2 && z[i][j]!=max) {
//                    max2=z[i][j];
//                }
//                }
//            }
//
//            System.out.printf("max is %d\n 2nd max is %d ",max,max2);


//        for(int i=0;i<a;i++){
//            if (i%2==0){
//            for(int j=0;j<b;j++) {
//
//               System.out.print(z[i][j]+" ");
//            }}
//            else{
//                for(int j=b-1;j>=0;j--){
//                    System.out.print(z[i][j]+" ");
//                }
//            }
//        }

//        for(int i=0;i<a;i++){
//                for(int j=0;j<b;j++) {
//if (j>=i) {
//    System.out.print(z[i][j] + " ");
//}

//if (j<=i)
//    System.out.print(z[i][j] + " ");
//
//                }
//            }


    }
    }

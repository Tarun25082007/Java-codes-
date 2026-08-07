//import java.util.*;
//public class roundsnake {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter row");
//        int n=sc.nextInt();
//        System.out.println("enter column");
//        int m=sc.nextInt();
//        int[][] arr=new int[n][m];
//        System.out.println("enter array");
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                int o=sc.nextInt();
//                arr[i][j]=o;
//            }
//        }
//        int count=n*m;
//        int top=0;
//        int left=0;
//        int right=m-1;
//        int bottom=n-1;
//        while (count>0){
//
//            for (int j=left;j<=right && count>0;j++){
//                System.out.print(arr[top][j]+" ");
//                count--;
//            }
//            top++;
//            for (int i=top;i<=bottom && count>0;i++){
//                System.out.print(arr[i][right]+" ");
//                count--;
//
//            }
//            right--;
//            for (int j=right;j>=left && count>0;j--){
//                System.out.print(arr[bottom][j]+" ");
//                count--;
//            }
//            bottom--;
//            for (int i=bottom;i>=top && count>0;i--){
//                System.out.print(arr[i][left]+" ");
//                count--;
//            }
//            left++;
//
//
//
//        }
//}
//}




//import java.util.*;
//public class roundsnake {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter row");
//        int n=sc.nextInt();
//        System.out.println("enter column");
//        int m=sc.nextInt();
//        int[][] arr=new int[n][m];
//
//        int count=n*m;
//        int top=0;
//        int left=0;
//        int right=m-1;
//        int bottom=n-1;
//        int num=1;
//        while (count>0){
//
//            for (int j=left;j<=right && count>0;j++){
//                arr[top][j]=num;
//                num++;
//                count--;
//            }
//            top++;
//            for (int i=top;i<=bottom && count>0;i++){
//                arr[i][right]=num;
//                num++;
//                count--;
//
//            }
//            right--;
//            for (int j=right;j>=left && count>0;j--){
//               arr[bottom][j]=num;
//               num++;
//                count--;
//            }
//            bottom--;
//            for (int i=bottom;i>=top && count>0;i--){
//                arr[i][left]=num;
//                num++;
//                count--;
//            }
//            left++;
//
//
//
//        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.print(arr[i][j]+" ");
//            }System.out.println();
//        }
//    }
//}







//import java.util.*;
//public class roundsnake {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter row");
//        int n=sc.nextInt();
//        System.out.println("enter column");
//        int m=sc.nextInt();
//
//       System.out.println("enter num to find");
//int k=sc.nextInt();
//int[] arry2=findk(n,m,k);
//if(arry2!=null){
//    System.out.println(arry2[0]+" "+arry2[1]);
//}else{
//System.out.println(" not found");}
//    }
//
//
//
//    public static int[] findk(int l,int p,int k){
//        if(k>l*p){
//            return null;
//        }int[][] arr=new int[l][p];
//
//
//        int count=l*p;//rather than this i can do in whil top<=bottom and left <=right
//        int top=0;
//        int left=0;
//        int right=p-1;
//        int bottom=l-1;
//        int num=1;
//        while (count>0){
//
//            for (int j=left;j<=right && count>0;j++){
//                arr[top][j]=num;
//                if (num==k){
//                    return new int[]{top,j};
//                }
//                num++;
//                count--;
//
//            }
//            top++;
//            for (int i=top;i<=bottom && count>0;i++){
//                arr[i][right]=num;
//                if (num==k){
//                    return new int[]{i,right};
//                }
//                num++;
//                count--;
//
//            }
//            right--;
//            for (int j=right;j>=left && count>0;j--){
//                arr[bottom][j]=num;
//                if (num==k){
//                    return new int[]{bottom,j};
//                }
//
//                num++;
//                count--;
//            }
//            bottom--;
//            for (int i=bottom;i>=top && count>0;i--){
//                arr[i][left]=num;
//                if (num==k){
//                    return new int[]{i,left};
//                }
//                num++;
//                count--;
//            }
//            left++;
//
//
//
//        }
//
//       return null;
//
//
//        }
//    }

import java.util.*;
public class roundsnake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row and column as square");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }


        int[][] arry1=find90(arr,n);
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){

                System.out.print(arry1[j][k]+" ");
            }
            System.out.println();
        }
    }



    public static int[][] find90(int[][] arr2, int p){
        int temp=0;


        //rather than this i can do in whil top<=bottom and left <=right
        int top=0;
        int left=0;
        int right=p-1;
        int bottom=p-1;
        int count=p-1;




        while(count>0){
for (int i=0;i<count;i++) {
    temp = arr2[top][left+i];
    arr2[top][left+i] = arr2[bottom-i][left];
    arr2[bottom-i][left] = arr2[bottom][right-i];
    arr2[bottom][right-i] = arr2[top+i][right];
    arr2[top+i][right] = temp;



}
top++;
left++;
right--;
bottom--;
count--;



    }
        return arr2;
    }}

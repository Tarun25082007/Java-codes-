import java.util.Arrays;
import java.util.Scanner;

public class mergsort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();}
            divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    public static void divide(int[] ar1, int si,int ei){
        if(si>=ei){
            return;
        }
       int mid=si +((ei-si)/2);
        divide(ar1,si,mid);
        divide(ar1,mid+1,ei);
        sorting(ar1,si,mid,ei);


    }
    public static void sorting(int[] ar,int si,int mid,int ei){
        int[] merge=new int[ei-si+1];
        int indx1=si,indx2=mid+1;
        int x=0;
        while(indx1<=mid && indx2<=ei){
            if(ar[indx1]<=ar[indx2]){
                merge[x++]=ar[indx1++];
            }
            else if(ar[indx1]>=ar[indx2]){
                merge[x++]=ar[indx2++];
            }
        }
        while(indx1<=mid){
            merge[x++]=ar[indx1++];
        }
        while(indx2<=ei){
            merge[x++]=ar[indx2++];
        }
        for(int i=0,j=si;i<merge.length;i++,j++){
            ar[j]=merge[i];
        }

    }
}

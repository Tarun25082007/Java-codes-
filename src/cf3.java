import java.util.*;
public class cf3{
    public static int[] solu(int n,int arry[]) {
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++)
                if(arry[j]<arry[i]){
                    arr2[i]+=arry[j];
                }


    }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for  (int j = 0; j < n; j++) {
                arr[j] = input.nextInt();

            }
            System.out.println(solu(n,arr));
        }}
}



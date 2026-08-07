import java.util.*;
public class bubble {
    public static void main (String[] args){
        System.out.println("enter length");
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("sorting taking place");
        int m=n;
        for (int i=0;i<n;i++){// n-1
            for (int j=0;j<m-1;j++){ // use n-1-i it wolud be better for space complexti
                if (arr[j+1]>arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            m--;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(Arrays.toString(arr));
    }

}

import java.util.*;
public class quicksort {
public static void quicksort(int[] ar,int start,int end){
    if (start>=end){
        return;
    }
    int pivot =partition(ar,start,end);
    quicksort(ar,start,pivot-1);
    quicksort(ar,pivot+1,end);
}
public static int partition(int[] ar,int start,int end){
    int pivot =ar[end];
    int i=start-1;
  for(int j=start;j<end;j++){
      if(ar[j]<pivot){
          i++;
          //swap
          int temp=ar[i];
          ar[i]=ar[j];
          ar[j]=temp;
          //saem as shifting zero logic is applied

      }
  }
  i++;
  int temp=ar[i];
  ar[i]=pivot;
  ar[end]=temp;
  return i;

}
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] ar=new int[n];
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
    }
    quicksort(ar,0,n-1);
System.out.println(Arrays.toString(ar));
}
}

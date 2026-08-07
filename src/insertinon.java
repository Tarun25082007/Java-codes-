import java.util.Arrays;
import java.util.Scanner;

public class insertinon {
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
            for (int i=1;i<n;i++){// i is 1 because we need atleast 1 num in j part for chcecking
                int current  =arr[i];//we assigh as furtheer there is sliding
                int j=i-1;//no eed to check from same elemnt we check from 1 below so thats why i is 1 or else j wpild be -1
               while (j>=0 && arr[j]>current){
                   arr[j+1]=arr[j];
                   j--;
                }
               arr[j+1]=current;// because we already wgile using while loop we do a j--


            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println(Arrays.toString(arr));
        }

    }



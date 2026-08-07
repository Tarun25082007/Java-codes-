import java.util.*;
public class ary {
    public static void main(String[] as) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int b = sc.nextInt();
        System.out.println("enter ary num");
        int[] a = new int[b];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[b];
        int[] e = new int[b];


//        System.out.println("enter num to fin");
//        int c=sc.nextInt();
//        int w=0;
//        for (int i=0;i<b;i++){
//            if (a[i]==c){
//                w=i;
//            }
//        }
//        if (w>0){
//            System.out.println("found it "+(w+1));
//        }
//        else{
//            System.out.println("not found");
//        }

//        for (int i=0;i<b;i++){
//            sum+=a[i];
//
//        }

//        for (int i=0;i<b;i++){
//        if (a[i]>max){
//            max=a[i];
//        }
//    }
//        System.out.println(max);
//        for (int i=0;i<b;i++){
//            if (a[i]%2 == 0 && a[i]!=0){
//                ecount++;
//            } else if (a[i]%2 != 0) {
//                ocount++;
//            }
//            else{
//                othercount++;
//            }
//        }
//        System.out.println("even counrt"+ecount+"  odd count"+ocount + "other stuff"+othercount);
//        for (int i=0;i<mid;i++){
//            temp=a[i];
//            a[i]=a[b];
//            a[b]=temp;
//            b--;
//        }
//        System.out.println("reverssefd array");
//        for  (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

//        for (int i=0;i<mid;i++){
//            temp=a[i];
//            a[i]=a[b];
//            a[b]=temp;
//            b--;
//        }

//for(int i=0;i<b-1;i++){
//    if(a[i]<a[i+1]){
//        s="yes";
//        break;
//    }
//    else{
//        s="no";
//    }
//}
//        for (int i=0;i<b;i++){
//            if (a[i]>max){
//                max=a[i];
//            }}
//        int smax=0;
//        for (int i=0;i<b-1;i++){
//            if  (a[i]>a[1+i] &&a[i+1]<max && a[i]!=max){
//                smax=a[i+1];
//            }
//            else if(a[i]<max){
//                smax=a[i];
//            }
//
//
//        }
//System.out.println(max);
//        System.out.println(smax);
//        boolean z=false;
//    for(int i =0;i<b;i++){
//        for (int j =0;j<i;j++){
//            if (a[j]!=a[i] && i!=j){
//                z=true;
//            } else {
//                z=false;
//            }
//
//
//        }
//        if(z==true){
//            d[i]=a[i];
//        }
//    }
//    System.out.println(a[0]);
//    for(int i =0;i<b;i++){
//        System.out.println(d[i]);
//    }
//    }
//}

//        int temp=a[b-1];
//        for(int i =b-1;i>0;i--) {
//            a[i] = a[i - 1];
//        }
//        a[0] = temp;
//        for(int i =0;i<b;i++){
//            System.out.println(a[i]);
//        }
//int j=0;
//        for (int i = 0; i < b; i++) {
//            if (a[i]!=0) {
//                int temp=a[i];
//                a[i]=a[j];
//                a[j]=temp;
//                        j++;
//            }
//
//
//        }
//        for (int i = 0; i < b; i++) {
//            System.out.print(a[i] + " ");
//        }

//        int j=0;
//        for (int i = 0; i < b; i++) {
//            for (int j1 = 0; j1 < b; j1++) {
//                if (a[i] == a[j1]) {
//                    d[i]++;
//                }
//            }
//
//
//        }
//        int f=1;
//        for (int i = 0; i < b; i++) {
//            if  (d[i] > 1) {
//
//            }
//            System.out.println(a[i] + ":"+d[i]);
//        }
//int j =0;
//        for  (int i = 0; i < b; i++) {
//            if (a[i] == a[j] && i!=j) {
//                a[i] = a[j];
//                a[j] = 0;
//                j++;
//            }else if(a[i] != a[j]) {
//                j++;
//            }}
//            int o=0;
//            for(int k = 0; k < b; k++) {
//                if (a[k] !=0) {
//                    int temp = a[k];
//                    a[k] = a[o];
//                    a[o] = temp;
//                    o++;
//                }
//            }
//            int nl=0;
//            for (int k = b-1; k >=0; k--) {
//                if(a[k] !=0) {
//                    nl=k;
//                    break;
//                }
//
//            }
//
//        for (int i = 0; i < nl+1; i++) {
//            System.out.println(a[i]);
//        }
//        int count=0;
//        for (int i = 0; i < b; i++) {
//            for (int j = 0; j < b - 1; j++) {
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//        }
//        for (int h=0;h<b-1;h++){
//            if (a[h]!=a[h+1]){
//                d[count]=a[h];
//                count++;
//            }
//        }
//        d[count]=a[b-1];
//        count++;
//
//
//        for (int i = 0; i < b; i++) {
//            if(d[i]>0){
//                System.out.println(d[i]);
//            }}

//        int count=0;
//        int count2=0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
//        for (int i = 0; i < b; i++) {
//            for (int j = 0; j < b - 1; j++) {
//                if (a[i]==a[j]) {
//                    count2++;
//
//                }
//
//            }e[i]=count2;
//            count2=0;
//
//        }
//
//
//        for (int h=0;h<b-1;h++){
//            if (a[h]!=a[h+1]){
//                d[count]=a[h];
//                e[count]=e[h];
//                count++;
//
//
//            }
//        }
//        d[count]=a[b-1];
//        e[count]=e[b-1];
//        count++;
//
//
//        for (int i = 0; i < b; i++) {
//            if(d[i]>0){
//                System.out.println(d[i] +":"+e[i]);
//            }}

        int count = 0;

        for (int i = 0; i < b; i++) {
            int freq = 1;

            while (i < b - 1 && a[i] == a[i + 1]) {
                freq++;
                i++;
            }

            d[count] = a[i];   // unique element
            e[count] = freq;   // its frequency
            count++;
        }

        for (int i = 0; i < b; i++) {
            if (e[i] > 0) {


                System.out.println(d[i] + " " + e[i]);
            }
        }
    }
}



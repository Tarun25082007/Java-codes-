import java.util.*;
    public class cf2 {
        public static int solu(String a) {
            StringBuilder f = new StringBuilder();
            StringBuilder h = new StringBuilder();
            int min=a.length();
            for (int i = 1; i < a.length()-1; i++) {
                f= new StringBuilder();
                int j=0;
                for (int k=0; k<a.length(); k++) {
                    if (i == k) {
                        continue;
                    }

                if ( f.length() == 0 || f.charAt(f.length()-1) != a.charAt(k)) {
                    f.append(a.charAt(k));
                }



            }  if(f.length()<min) {
                    min =f.length();
                }}

                return min;



        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int t = input.nextInt();
            for (int i = 0; i < t; i++) {
                int h = input.nextInt();
                String n = input.next();
                input.nextLine();
                System.out.println(solu(n));
            }}
    }



import java.util.*;
public class keypad {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String s = sc.nextLine();
        ky(s,0," ");

    }
    public static String[] combi={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void ky(String s,int index,String h){
        if (index==s.length()){
            System.out.println(h);
            return;
        }
        char current = s.charAt(index);
        String s1 = combi[Integer.parseInt(String.valueOf(current))];
        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i)==s.charAt(i+1)){
                index++;

            }
        }


    }
}

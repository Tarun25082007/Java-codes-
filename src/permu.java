import java.util.*   ;
public class permu {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    func(s,"");
}
public static void func(String s,String p){
    if (0==s.length())
    {
        System.out.println(p);
        return;
    }
    /* kind of add removw thign like in first looop i take the first char
    thn that i add to the p which i print then i remove it in new strign send that then that repaets after
    1 cycle we again go to second char and continue its like add and remove algo
    time complexity is n factorial
     */
    for (int j=0;j<s.length();j++){
        String ns = s.substring(0,j)+s.substring(j+1);
        func(ns,p+s.charAt(j));
    }
}
}

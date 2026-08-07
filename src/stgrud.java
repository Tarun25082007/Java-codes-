import java.util.*;
public class stgrud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st sting");
        String y=sc.nextLine();
        System.out.println("enter 2nd sting");
        String z=sc.nextLine();
        if(round(y,z))
        {
            System.out.println("it is round about");
        }
        else{
            System.out.println("it is not round about");}


    }
    public static boolean round(String x,String y)
    {
        boolean a=false;
        if(x.length()!=y.length())
        {
            a=false;
        }
        else{
            int j=-1;
            for(int i=0;i<y.length();i++)
            {
                if (x.charAt(0)==y.charAt(i)){
                    j=i;
                    a=true;
                    break;
                }
            }
            for(int i=0;i<y.length() && j!=-1;i++,j++){
                if(j>=y.length())
                {
                    j=0;
                }
                if (x.charAt(i)!=y.charAt(j)){
                    a=false;
                    break;
                }
            }
        }
        return a;
    }
}

import java.util.*;
import bank.* ;
public class oops2 {public static void main(String[]args){
    car1 x = new car1(3);
    car2 y = new car2(5);
    bank b = new bank();
    b.name ="hi";
    System.out.println(b.name);
    x.setName("hi");
    System.out.println(x.getName());


}}
class car1{
    car1(int n){
        System.out.print("Enter number: " +n);
    }
    // not accessable
    private String name ;
    //use a getter
    public String getName( ){
        //setname(randomename) i could do this to automatically set a password
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class car2 extends car1{
    car2(int n){
        super(n);

    }
}
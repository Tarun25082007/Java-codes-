import java.util.Scanner;

class car{
    String typr;
    Double price;
    public void display(){
        System.out.println(this.typr+" " +this.price);
    }//poly morphism
    public void display(double n){
        System.out.println(n+" ");
    }
    public void display(double price, String n){
        System.out.println(n+" "+price);
    }

    //constuctor
    car(String typr,Double price){
        System.out.println("constructor called now enter details");
    }
    car(car c3){
        this.typr=c3.typr;
        this.price=c3.price;
    }
}
class bike extends car{
    bike(String typr, Double price) {
        super(typr, price);
    }
    // facing issue for constructor use super
}//single
class cycle extends bike{
    cycle(String typr, Double price) {
        super(typr, price);
    }
}//multi
class scooty extends bike{
    scooty(String typr, Double price) {
        super(typr, price);
    }
}//hierarchical
public class oops1 {
    public static void main(String[] args) {
        car car1=new car("j",87.0);
        car car2=new car("f",90.);
//        Scanner sc=new Scanner(System.in);
//        car1.typr=sc.nextLine();
//        car1.price=sc.nextDouble();
        car1.typr="j";
        car1.price=87.0;
        car2.typr="hybrid";
        car2.price=(double)3000;
        car1.display();
        car2.display();
        car c3=new car(car1);//whatever is inside the value will be copied
        c3.display();
        car1.display(car2.price);
        bike b1=new bike(car1.typr,car1.price);
        b1.display();
        scooty s1=new scooty("j",87.0);
        s1.display();


    }
}

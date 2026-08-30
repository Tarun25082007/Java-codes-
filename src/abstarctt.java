//class animal{
//    public void walk(){}
//}
//class dog extends animal{
//    public void walk(){
//        System.out.println("walks on 4 legs ");
//    }
//}
//class chicken extends animal{
//    public void walk(){
//        System.out.println("walks on 2 legs ");
//    }
//}
// this is if there is no use of abstract
abstract class animal{//its because like i am not using it
    abstract void walk();// not using it but i need walk in all of them
animal(){
    System.out.println("this is abstarct but wiil work each time As inherited");
}
static String name ;
}
class dog extends animal{
    public void walk(){
        System.out.println("walks on 4 legs ");
    }
}
class chicken extends animal{
    public void walk(){
        System.out.println("walks on 2 legs ");
    }
}
interface bird{
    void fly();//default its public and i cannot use an nonabstract stuff inside

}
interface fish{
    void eat();
}// i can inherit multiple classes
class bear implements bird,fish{
    public void fly(){
        System.out.println("bears fly");
    }
    public void eat(){
        System.out.println("bears eat");
    }
}

public class abstarctt {
    public static void main(String[] args) {
        dog d = new dog();
        chicken c = new chicken();
        d.walk();
        c.walk();
       // animal x = new animal() ;
       // x.walk();
      //  does not work
        bear b = new bear();
        b.fly();
        b.eat();
        animal.name="tomy";
        System.out.println(animal.name);
    }
}


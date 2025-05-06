package Apr;
 abstract class Base
{
    public void method1()
    {
        System.out.println("This is regular method");
    }
    abstract void method();

}

class Down extends Base{
     public void method(){
         System.out.println("This is down method");
     }
}
class Top extends Base{
    public void method(){
        System.out.println("This is top method");
    }
}
public class Lab5Apr25_Abstraction {
    public static void main(String[] args) {
        Base myDown=new Down();
        Base myTop= new Top();
        myTop.method();
        myTop.method1();
        myDown.method();
        myDown.method1();

    }
}

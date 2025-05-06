package May;

abstract class Base{
    public void method(){
        System.out.println("this is normal");
    }
    abstract void method1();
}
class Top extends Base{
    public void method1(){
        System.out.println("this is Top abst");
    }
}
class Down extends Base{
    public void method1(){
        System.out.println("this is Down abst");
    }
}

public class Lab3May25_Abstraction {
    public static void main(String[] args) {
        Base myDown=new Down();
        Base myTop= new Top();
        myTop.method();
        myTop.method1();
        myDown.method();
        myDown.method1();

    }
}

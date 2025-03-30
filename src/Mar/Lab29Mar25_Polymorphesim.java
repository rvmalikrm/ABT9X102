package Mar;


import org.w3c.dom.ls.LSOutput;

class A{
    public void methosA(){
        System.out.println("method A ");
    }
}
class b extends A{
    public void methodA(){
        System.out.println("method B");
    }
}
class c extends A{
    public void methodA(){
        System.out.println("method C");
    }
}
public class Lab29Mar25_Polymorphesim {
    public static void main(String[] args) {


    A o=new A();
    A o1=new b();
    A o2=new c();
    o.methosA();
    o1.methosA();
    o2.methosA();

}}

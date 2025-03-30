package Mar;


class House{
    public void Big(){
        System.out.println("This is House");
    }
}
class Flat extends House{
    public void Small(){
        System.out.println("This is Flat");
    }
}class Farm extends House{
    public void Open(){
        System.out.println("This is Open");
    }
}


public class Lab30Mar25_Polimorphism {
    public static void main(String[] args) {
        House obj=new House();
        Flat obj1=new Flat();
        Farm obj3=new Farm();
        obj.Big();
        obj1.Small();
        obj3.Open();

    }
}

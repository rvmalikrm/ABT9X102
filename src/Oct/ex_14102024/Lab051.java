package Oct.ex_14102024;
class Hello{
    int i1=10;
    byte b1=10;
    int i2= 130;
    long l1=12l;
    long l2=2147483648l;
    float f1=10.01f;
    double d1=11.11d;
    void m1(){
        System.out.println("m1 in Hello ");
        byte b11=b1;
        byte b12=(byte)i1;
        int i11=i1;
        int i12=i1;
        int i13=(int)i1;
        long l11=i1;
        float f11=f1;
        float f12=(float)d1;
        double d11=i1;
        double d12= f1;
        int i14=(int)d1;
        byte b13= (byte)i1;
        int i15=(int)i2;
        System.out.println(b11);
        System.out.println(b12);
        System.out.println(i11);
        System.out.println(i12);
        System.out.println(i13);
        System.out.println(i11);
        System.out.println(f11);
        System.out.println(f12);
        System.out.println(d11);
        System.out.println(d12);
        System.out.println(i14);
        System.out.println(b13);
        System.out.println(i15);
    }

}

public class Lab051 {
    public static void main(String[] args){
        Hello h1=new Hello();
        h1.m1();
    }
}

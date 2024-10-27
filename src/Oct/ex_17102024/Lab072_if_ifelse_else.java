package Oct.ex_17102024;

public class Lab072_if_ifelse_else {
    public static void main(String[] args) {
        //Condition -> 2 outputs
        // Can we have 2 output or not
        int num1 =20;
        int num2 =20;
        // 1 -> num1 > num2
        // 2 -> num2 > num1
        // 3 -> num1== num2
        if(num1>num2){
            System.out.println("Num1 > Num2 ");
        }
        else if(num2>num1){
            System.out.println("Num2 > Num1");
        }
        else {
            System.out.println("Equals");
        }
    }
}

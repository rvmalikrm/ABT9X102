package Oct.ex_17102024;

import java.util.Scanner;

public class Lab071 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("Num is -> Even");
        }
        else {
            System.out.println("Num is -> Odd");
        }
    }
}

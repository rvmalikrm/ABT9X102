package Oct.ex_10102024;

import java.util.Scanner;

public class Lab027_printf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number to print the Table");
        int table=18;
        for (int i = 1; i <= 10;i++){
            System.out.printf("%d x %d = %d \n" ,table, i, table*i );
        }
    }
}

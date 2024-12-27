package Oct.ex_10102024;

import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the Table");
        int table=sc.nextInt();
        for (int i = 1; i <= 10;i++){
            System.out.printf("%d x %d = %d \n" ,table, i, table*i );
        }
    }
}

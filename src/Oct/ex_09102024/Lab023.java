package Oct.ex_09102024;

public class Lab023 {
    public static void main(String[] args) {
        int age =10; // Local variable scope is in the curlibraces {}

        {
            int sachin =50;
            System.out.println(sachin);
            System.out.println(age);
        }
        // System.out.println(sachin); scoppe of sachin varible is within {}
    }

}

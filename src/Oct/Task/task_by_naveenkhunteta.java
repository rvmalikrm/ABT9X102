package Oct.Task;
import java.lang.Integer;

public class task_by_naveenkhunteta {

        public static void main(String[] args) {
            Integer i1 = 127;
            Integer i2 = 127;
            System.out.println(i1 == i2);     // Line 1

            Integer i3 = 128;
            Integer i4 = 128;
            System.out.println(i3 == i4);     // Line 2

            Integer i5 = new Integer(127);
            Integer i6 = new Integer(127);
            System.out.println(i5 == i6);     // Line 3
        }
    }


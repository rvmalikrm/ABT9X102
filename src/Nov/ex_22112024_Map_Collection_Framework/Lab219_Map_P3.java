package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;


public class Lab219_Map_P3 {
    public static void main(String[] args) {
        Map<String, Object> student1 =new HashMap();
        student1.put("Name", "Ravi ");
        student1.put("Phone", 787653454);
        student1.put("Addres", "Noida");

        Set book_read_items=new HashSet();
        book_read_items.add("Rich Dad Poor Dad");
        book_read_items.add("Eat the Frog");
        book_read_items.add("Sapiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        System.out.println(book_read_items);







    }
}

package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Lsb217_Map_P1 {
    public static void main(String[] args) {
        // Map is key value pairt
        // Nme : Ravi
        // Rool Number: 123;
        // Phone : 4567876567

        Map m1= new HashMap(); // Generics
        //Map<String, Object> m1 =new HashMap(); // Data type Fix
        m1.put("Name","RaviMalik");
        m1.put(123, "roll no");
        m1.put("Phone", "1234567");
        System.out.println(m1);

    }
}

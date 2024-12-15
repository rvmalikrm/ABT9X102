package Nov.ex_22112024_Map_Collection_Framework;

import org.xml.sax.ext.Attributes2;

import java.util.HashMap;
import java.util.Map;

public class Lsb218_Map_P2 {
    public static void main(String[] args) {

        // Here we fixed the data type
       //Map<String, Integer> map =new HashMap<String,Integer>(); Old Traditional method
        // Map<String, Integer> map =new HashMap<>();
        Map<String, Integer> map =new HashMap();
        map.put("id", 1);
        map.put("id", 2); // always take the latest value
        map.put("id2", 3); //
        map.put("id3", 4);
        map.put("id5", null); // null value is allowed
        map.put("id6", null); // null value is allowed  many time
        map.put(null, 123); // Null key is allowed only one time
        map.put(null, 321); // Null key is now allowed more than one time
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));
        System.out.println(map.containsValue(3));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));
        System.out.println(map.entrySet());
        System.out.println(map.values());

        // Here we don't fix the data type
        //Map map =new HashMap();




    }
}

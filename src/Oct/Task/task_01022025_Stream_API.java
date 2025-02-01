package Oct.Task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class task_01022025_Stream_API {
    public static void main(String[] args) {
    List<String> str= Arrays.asList("abc", "", "efg","","hij","","klm","mn");
    //Get the stream form the list using the method
        //then apply filler
        //Latly count the result of the filetr
        long count= str.stream().filter(string->string.isEmpty()).count();
        System.out.println(count);
    }
}

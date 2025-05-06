package May;
import java.util.LinkedHashMap;
import java.util.Map;
public class Lab6may25_firstNonRepeativeChar {
    public static void main(String[] args) {
        String input ="automation";
        Character ch=firstNonRepeatChar(input);
        if(ch!='\0') {
            System.out.println("Non repeative char "+ch);
        }
        else{
            System.out.println("There is no non repeative character in given String");
        }
    }
    public static char firstNonRepeatChar(String input)
    {
        char[] chararr=input.toCharArray();
        Map<Character, Integer> mpfreq=new LinkedHashMap<>();
        StringBuilder freq=new StringBuilder();
        for(char  ch:chararr){
            mpfreq.put(ch,mpfreq.getOrDefault(ch,0)+1);
        }
        // Find the first character with frequency 1
        for (Map.Entry<Character, Integer> entry: mpfreq.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}

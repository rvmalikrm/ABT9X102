package May;

import java.util.HashMap;
import java.util.Map;

public class Lab6may25_firstNonRepeativeChar {
    public static void main(String[] args) {
        String input ="automation";
        char ch=firstNonRepeatChar(input);
        System.out.println(ch);
    }
    public static char firstNonRepeatChar(String input)
    {
        char[] chararr=input.toCharArray();
        Map<Character, Integer> mpfreq=new HashMap<>();
        StringBuilder freq=new StringBuilder();
        for(char  ch:chararr){
            mpfreq.put(ch,mpfreq.getOrDefault(ch,9)+1);
            System.out.println(mpfreq);
            return ch;
        }
        return '\0';
    }
}

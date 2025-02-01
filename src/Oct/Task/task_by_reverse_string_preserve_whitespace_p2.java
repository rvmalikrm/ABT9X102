package Oct.Task;

public class task_by_reverse_string_preserve_whitespace_p2
{

        public static void main(String[] args)
        {
            String input="Hello World Example";
            String reverse=reversestringpreservingwhitespace(input);
            System.out.println("Original String is "+ input);
            System.out.println("Original String is "+ reverse);
        }
        public static String reversestringpreservingwhitespace(String input){
            char[] ch=input.toCharArray();
            int left=0, right= ch.length-1;
            while(left<right)
            {
            if(ch[left]==' ')
                {
                left++;
                }
            else if (ch[right]==' ')
                {
                right--;
                }
            else {
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
                }
            }
            return new String(ch);
        }
}


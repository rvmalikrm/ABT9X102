package Oct.Task;

public class task_by_reverse_string_preserve_whitespace {

        public static void main(String[] args) {
            String s=" This is Dog";
            int strlen=s.length();
            String rs="";

            System.out.println(strlen);
            for(int i=strlen;i>0;i--)
            {
                System.out.print(s.charAt(i-1));
            }
        }
    }


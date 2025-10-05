package Oct2025;

public class Lab05Oct25_Makefisrtcharcapital {
    public static void main(String[] args) {
        String str = " hello work";
        String[] words =str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word: words){
            if(word.length()>0){


                String capitalizedWord= word.substring(0,1).toUpperCase()+word.substring(1);
                sb.append(capitalizedWord).append(" ");

            }else{
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}

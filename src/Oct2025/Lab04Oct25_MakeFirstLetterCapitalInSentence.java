package Oct2025;

public class Lab04Oct25_MakeFirstLetterCapitalInSentence {
    public static void main(String[] args) {
        String str= "hello everyone! welcome to the world of automation." ;
        String[] words= str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            if(word.length()>0){
                String capitalizedWord= word.substring(0,1).toUpperCase()+word.substring(1);
                result.append(capitalizedWord).append(" ");
            }else{
                result.append(" ");
            }
        }
    }
}

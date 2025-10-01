package Oct2025;

public class Lab01Oct25_ReverseSentence {
    public static void main(String[] args) {
        String str= "QA is Automation";
        String[] input = str.split(" ");
        for (int i=input.length-1;i>=0;i--){
            System.out.print(input[i]+" ");
        }
    }
}

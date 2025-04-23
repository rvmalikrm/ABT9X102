package Apr;

public class Lab23Apr25_Palindrome {
    public static void main(String[] args)
    {
        String input="Madam";
        if(isPalindrome(input.toLowerCase()))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
    public static boolean isPalindrome(String input){
        int n=input.length();
        for(int i=0;i<n/2;i++){
            if(input.charAt(i)!=input.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
}

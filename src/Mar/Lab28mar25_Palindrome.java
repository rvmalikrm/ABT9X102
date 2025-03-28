package Mar;

public class Lab28mar25_Palindrome
{
    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str="maam";
        if(isPalindrome(str))
        {
            System.out.println("Is Palindrome");
         }
        else
            System.out.println("No Palindrome");
    }
}

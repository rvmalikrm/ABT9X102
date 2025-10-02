package Oct2025;

public class Lab02Oct2025_Anagramchecker {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        boolean status=true;
        if(str1.length()!=str2.length()){
            status=false;
        }else{
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();
            java.util.Arrays.sort(arr1);
            java.util.Arrays.sort(arr2);
            status=java.util.Arrays.equals(arr1,arr2);
        }
        if(status){
            System.out.println(str1+" and "+str2+" are anagram ");
        }else{
            System.out.println(str1+" and "+str2+"  are not anagram ");
        }
    }
}

package Oct2025;

public class Lab04Oct25_FindSecondLargest {
    public static void main(String[] args) {
        int[] arr={12,54,65,23,76,3,56,76,9,78,100};
        int highest= Integer.MIN_VALUE;
        int secondhighest= Integer.MIN_VALUE;
        for( int n:arr){
            if(n>highest){
                secondhighest=highest;
                highest=n;

            } else if (n > secondhighest && n != highest) {
                secondhighest=n;
            }

        }
        System.out.println(secondhighest);
    }
}

package Feb2026;

public class Lab052026_secondlargestelementinArray {
    public static void main(String[] args) {
        int[] arr= {5,3,8,1,4,9,7};
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int num: arr){
            if(num>largest){
                secondLargest= largest;
                largest= num;
            } else if(num>secondLargest && num!=largest){
                secondLargest= num;
            }
        }
        System.out.println("Second largest element is: "+ secondLargest);


    }
}

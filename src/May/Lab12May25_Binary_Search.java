package May;
public class Lab12May25_Binary_Search {
    public static void main(String[] args) {
        int[] input= {1,2,3,5,7,8,10,13,16};
        int target=10;
        int result=binarySearch(input,target);
        if(result!=-1){
            System.out.println("The element is at "+result);
        }
        else {
            System.out.println(" The element is not found");
        }
    }
    public static int binarySearch(int[] arr, int target){
        int left =0, right= arr.length-1;
        while (left<=right)
        {
        int mid= left+(right-left)/2;
        if(arr[mid]== target) {
            return mid;
        }
            else if (arr[mid]<target)
                left= mid+1;
            else
                right=mid-1;
        }
        return -1;
        }
    }


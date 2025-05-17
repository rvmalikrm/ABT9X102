package May;

public class Lab17May25_RightShiftArray {
    public static void main(String[] args) {
        int[] input={1,2,3,4,5};
        int key=2;
        int index = rightShift(input,key);
        System.out.println("Index of " + key + ": " + index);
    }
    public static int  rightShift(int[] input,int k){
        int n = input.length;
        k %= n;  // Handle if k > n
        reverse(input, 0, n - 1);
        reverse(input, 0, k - 1);
        reverse(input, k, n - 1);
        return -1;
    }
    private static void reverse(int[] input, int start, int end) {
        while (start < end) {
            int temp = input[start];
            input[start++] = input[end];
            input[end--] = temp;
        }
    }
}

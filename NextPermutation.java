import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {
    private static void swap(ArrayList<Integer> nums, int x, int y) {
        int temp = nums.get(x);
        nums.set(x, nums.get(y));
        nums.set(y, temp);
    }

    private static void reverse(ArrayList<Integer> nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) {
        int n = nums.size();
        int index1 = n - 2;

        while(index1>=0 && nums.get(index1) >= nums.get(index1+1)) {
            index1--;
        }

        int index2 = n - 1;
        if(index1 >= 0) {
            while(nums.get(index1) >= nums.get(index2)) {
                index2--;
            }
            swap(nums, index1, index2);
        }
        reverse(nums, index1+1, n-1);
        return nums;
    } 
}

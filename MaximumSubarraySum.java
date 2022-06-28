import java.util.* ;
import java.io.*; 

public class MaximumSubarraySum {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        
        for(int it : arr) {
            sum += it;
            maxi = Math.max(maxi, sum);
            if(sum < 0)    sum = 0;
        }
        
        return maxi < 0 ? 0 : maxi;
	}
}

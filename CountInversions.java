import java.util.* ;
import java.io.*; 
public class CountInversions {
    private static long merge(long arr[], long temp[], int left, int mid, int right) {
        int i = left, j = mid, k = left;
        long inv_count = 0;
        while((i <= mid - 1) && (j <= right)) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
                inv_count = inv_count + (long)(mid -i); 
            }
        }
        while(i <= mid-1) {
            temp[k++] = arr[i++];
        }
        while(j <= right) {
            temp[k++] = arr[j++];
        }
        for(i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
        return inv_count;
    }
    
    private static long merge_sort(long arr[], long temp[], int left, int right) {
        int mid = 0;
        long inv_count = 0;
        if(left < right) {
            mid = left + (right - left)/2;
            inv_count += merge_sort(arr, temp, left, mid);
            inv_count += merge_sort(arr, temp, mid + 1, right);
            inv_count += merge(arr, temp, left, mid + 1, right);
        }
        return inv_count;
    }
    
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long[] temp = new long[n];
        return merge_sort(arr, temp, 0, n - 1);
    }
}

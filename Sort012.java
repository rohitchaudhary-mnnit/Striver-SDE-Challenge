import java.util.* ;
import java.io.*; 
public class Sort012 
{
    public static void sortColors(int[] arr)
    {
        //Write your code here
        int n = arr.length;
        int lo = 0, mid = 0;
        int hi = n - 1;
        
        while(mid <= hi) {
            if(arr[mid] == 0) {
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                lo++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }
}

import java.util.ArrayList;

public class MissingAndRepeatingNumber {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] res = new int[2];
        int[] freq = new int[n + 1];
        
        for(int it : arr) {
            freq[it]++;
        }
        for(int i = 1; i <= n; i++) {
            if(freq[i] == 0) { //missing number
                res[0] = i;
            }
            if(freq[i] > 1) { //repeating number
                res[1] = i;
            }
        }
        
        return res;
    }
}

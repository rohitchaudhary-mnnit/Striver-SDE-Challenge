import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class MaximumStockSellProfit {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int n = prices.size(), maxProfit = 0;
        int buy = prices.get(0);
        for(int i = 1; i < n; i++) {
            buy = Math.min(buy, prices.get(i));
            maxProfit = Math.max(maxProfit, prices.get(i) - buy);
        }
        return maxProfit;
    }
}

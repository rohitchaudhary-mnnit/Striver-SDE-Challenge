import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class MergeIntervals {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> res = new ArrayList<>();
        if(intervals.length == 0 || intervals == null)
            return res;
        
        Arrays.sort(intervals, (i1, i2) -> i1.start - i2.start);
        int s = intervals[0].start;
        int f = intervals[0].finish;
        
        for(Interval i : intervals) {
            if(i.start <= f) {
                f = Math.max(f, i.finish);
            }
            else {
                res.add(new Interval(s, f));
                s = i.start;
                f = i.finish;
            }
        }
        res.add(new Interval(s, f));
        return res;
    }
}

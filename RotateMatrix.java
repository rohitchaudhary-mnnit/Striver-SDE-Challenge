import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class RotateMatrix {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int r = 0, c = 0;
        int prev = 0, curr = 0;
        
        while(r < n && c < m) {
            if(r + 1 == n || c + 1 == m) {
                break;
            }
            prev = mat.get(r+1).get(c);
            for(int i = c; i < m; i++) {
                curr = mat.get(r).get(i);
                mat.get(r).set(i, prev);
                prev = curr;
            }
            r++;
            
            for(int i = r; i < n; i++) {
                curr = mat.get(i).get(m-1);
                mat.get(i).set(m-1, prev);
                prev = curr;
            }
            m--;
            
            if(r < n) {
                for(int i = m - 1; i >= c; i--) {
                    curr = mat.get(n-1).get(i);
                    mat.get(n-1).set(i, prev);
                    prev = curr;
                }
            }
            n--;
            
            if(c < m) {
                for(int i = n - 1; i >= r; i--) {
                    curr = mat.get(i).get(c);
                    mat.get(i).set(c, prev);
                    prev = curr;
                }
            }
            c++;
        }
    }
}

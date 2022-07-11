import java.util.* ;
import java.io.*; 
public class ModularExponentiation {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        long ans = 1; //to prevent overflow
        long xx = x;
        while(n > 0) {
            if(n % 2 == 1) { //odd power
                ans = (ans * xx % m)%m;
                n = n - 1;
            }
            else { //even power
                xx = (xx%m * xx%m) % m;
                n = n / 2;
            }
        }
        return (int)(ans % m);
    }
}
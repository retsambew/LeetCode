import java.util.Arrays;

/*
 * 2160. Minimum Sum of Four Digit Number After Splitting Digits
 */

public class MinSplitSumOf4 {
    public int minimumSum(int num) {
        int ar[]=new int[4];
        for(int i=0;i<4;i++){
            ar[i]=num%10;
            num/=10;
        }
        Arrays.sort(ar);
        return ((ar[0]+ar[1])*10)+ar[2]+ar[3];
    }
}

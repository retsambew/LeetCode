/*
 * Problem 2269 - Sliding Window
 * Find the K-Beauty of a Number
 */

public class KBeautyNumber {

    public int divisorSubstrings(int num, int k) {
        String strNum = String.valueOf(num);
        int ans=0;
        for (int i=0; i<=strNum.length()-k; i++){
            int divisor = Integer.parseInt(strNum.substring(i, i+k));
            if(divisor>0 && num%divisor==0)
                ans++;
        }
        return ans;
    }

    // public int divisorSubstrings(int num, int k) {
    //     int ans=0;
    //     int n=1;
    //     for(int i=1;num/i>9;i*=10){
    //         n++;
    //     }
    //     for (int i=0; i<n-k+1; i++){
    //         int divisor=0;
    //         for(int j=0; j<k; j++){
    //             divisor=(divisor*10)+((num/(int)Math.pow(10, n-i-j-1))%10);
    //         }
    //         if(divisor!=0 && num%divisor==0)
    //             ans++;
    //     }
    //     return ans;
    // }
}

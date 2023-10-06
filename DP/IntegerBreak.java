/* 
 * 343. Integer Break
 */

class Solution {
    /* Tabulation */
    public int integerBreak(int n) {
        int dp[] = new int[59];
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            int maxi = 1;
            for(int j=1; j<i; j++){
                maxi = Math.max(maxi, j * Math.max(i-j, dp[i-j]));
            }
            dp[i] = maxi;
        }
        return dp[n];
    }

    /* Memoization */
    // int dp[] = new int[59];
    // public int integerBreak(int n) {
    //     if(n==1) return 1;
    //     int ans = 1;
    //     for(int i=1; i<n; i++){
    //         if(dp[n-i]==0)
    //             dp[n-i]=integerBreak(n-i);
    //         ans = Math.max(ans, i * Math.max(n-i,dp[n-i]));
    //     }
    //     return ans;
    // }
}
/* 
 * 343. Integer Break
 */

class Solution {
    int dp[] = new int[59];
    public int integerBreak(int n) {
        if(n==1) return 1;
        int ans = 1;
        for(int i=1; i<n; i++){
            if(dp[n-i]==0)
                dp[n-i]=integerBreak(n-i);
            ans = Math.max(ans, i * Math.max(n-i,dp[n-i]));
        }
        return ans;
    }
}
class Solution {
    final static long MOD = (long)1e9+7;
    
    public long takeStep(int steps, int n, int i, long[][] dp){
        if(steps == 0 && i==0) return 1;
        if(i<0 || i>=n || steps <= 0) return 0;
        if(dp[steps][i] != -1) return dp[steps][i];

        long ans = takeStep(steps-1, n, i-1, dp) % MOD;
        ans += takeStep(steps-1, n, i, dp) % MOD;
        ans += takeStep(steps-1, n, i+1, dp) % MOD;
        dp[steps][i] = ans % MOD;
        return ans % MOD;
    }

    public int numWays(int steps, int arrLen) {
        long[][] dp = new long[steps+1][Math.min(arrLen,steps)+1];
        for(int i=0; i<=steps; i++)
            Arrays.fill(dp[i],-1);

        return (int)takeStep(steps, arrLen, 0, dp);
    }
}
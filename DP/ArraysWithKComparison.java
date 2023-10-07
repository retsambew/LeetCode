/* 
 * 1420. Build Array Where You Can Find The Maximum Exactly K Comparisons
 */

class Solution {

    final static long MOD = (long)1e9+7;
    long[][][] dp = new long[51][51][105]; // [n][k][max]
    public int numOfArrays(int n, int m, int k) {
        if( k>m ) return 0;
        for(int i=0;i<51;i++){
            for(int j=0; j<51; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
    
        return (int)solve(n, m, k, -1);
    }

    public long solve(int n, int m, int k, int max){
        if( k<0 ) return 0;
        if( n==0 ){
            if ( k==0 ) 
                return 1;
            return 0;
        }

        if(dp[n][k][max+1]!=-1) 
            return dp[n][k][max+1];
        
        long ans = 0;
        for(int i=1; i<=m; i++){
            if(i>max)
                ans = (ans + solve(n-1, m, k-1, i)) % MOD;
            else
                ans = (ans + solve(n-1, m, k, max)) % MOD;
        }

        dp[n][k][max+1] = ans;
        return ans;
    }
}
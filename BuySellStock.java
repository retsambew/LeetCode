/*
    121. Best Time to Buy and Sell Stock
*/
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=prices[0];
        int ans=0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
                max=prices[i];
            }
            else if(max<prices[i])
                max=prices[i];
            if(ans<max-min)
                ans=max-min;
        }
        return ans;
    }
}
/*
 * Problem 2379 - Sliding window
 * Minimum Recolors to Get K Consecutive Black Blocks
 */

public class KConsBlock {
    public int minimumRecolors(String blocks, int k) {
        int minChng=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++){
            String sub=blocks.substring(i,i+k);
            int count = 0;
            for (int j = 0; j < sub.length(); j++) {
                if(sub.charAt(j)=='W')
                    count++;
            }
            minChng=Integer.min(minChng, count);
        }
        return minChng;
    }
}   

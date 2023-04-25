/*
 * 190. Reverse Bits
 */

public class ReverseBits {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            if ((int) (n & 1) == 1)
                ans ^= 1;
            n >>= 1;
        }
        return ans;
    }
}

/*
 * 7. Reverse Integer
 */

public class reverseInteger {
    public int reverse(int x) {
        long n=0;
        while(x!=0){
            n=(n*10+(x%10));
            x/=10;
        }
        if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE)
            return 0;
        return (int)n;
    }
}

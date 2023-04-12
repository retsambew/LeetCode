/*
 * 9. Palindrome Number
 */

public class PalindromeNum {
    public boolean isPalindrome(int x) {
        int n=0;
        int copy=x;
        while(copy>0){
            n=(n*10)+(copy%10);
            copy/=10;
        }
        return n==x;
    }
}

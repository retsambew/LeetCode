/*
 * 50. Pow(x, n)
 */

public class Pow {
    // Optimized
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        if (n % 2 == 0)
            return myPow(x * x, n / 2);
        return x * myPow(x, n - 1);
    }

    // Stack Overflow
    // public double myPow(double x, int n) {
    // if (n == 0)
    // return 1;
    // if (n > 0)
    // return x * myPow(x, n - 1);
    // return myPow(x, n + 1) / x;
    // }
}

class Solution {
    public int fib(int n) {
        int fibz = 0;
        int fibo = 1;
        int fib = 1;
        if (n == 0) {
            return 0;
        } else {
            for (int i = 2; i <= n; i++) {
                fib = fibo + fibz;
                fibz = fibo;
                fibo = fib;
            }
        }
        return fib;
    }
}
class Solution {
    private static final int MOD = 1_000_000_007;

    public int bestNumbers(int n, int a, int b, int c, int d) {
        if (a == b) {
            long sum = (long) n * a;
            return isBest(sum, c, d) ? 1 : 0;
        }

        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long count = 0;

        for (int k = 0; k <= n; k++) {
            long sum = (long) k * a + (long) (n - k) * b;

            if (isBest(sum, c, d)) {
                count = (count + nCr(n, k, fact)) % MOD;
            }
        }

        return (int) count;
    }

    private boolean isBest(long num, int c, int d) {
        if (num == 0) {
            return c == 0 || d == 0;
        }
        
        while (num > 0) {
            long digit = num % 10;
            if (digit == c || digit == d) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    private long nCr(int n, int r, long[] fact) {
        if (r < 0 || r > n) return 0;
        long num = fact[n];
        long den = (fact[r] * fact[n - r]) % MOD;
        return (num * power(den, MOD - 2)) % MOD;
    }

    private long power(long base, long exp) {
        long res = 1;
        base = base % MOD;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }
}

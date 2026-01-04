class Solution {
    public int sumFourDivisors(int[] nums) {
        int res = 0;

        for(int num : nums){
            if(sumOne(num) != -1)res+=sumOne(num);
        }

        return res;
    }

    private int sumOne(int n) {
        // Case 1: p^3
        int p = (int) Math.round(Math.cbrt(n));
        if ((long) p * p * p == n && isPrime(p)) {
            return 1 + p + p * p + p * p * p;
        }

        // Case 2: p * q
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int a = i;
                int b = n / i;
                if (a != b && isPrime(a) && isPrime(b)) {
                    return 1 + a + b + n;
                }
                return -1;
            }
        }
        return -1;
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
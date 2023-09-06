class Solution {
public:
    int countDigits(int num) {
        int a = num, ans = 0;
        while(a) {
            if(num % (a % 10) == 0) ans++;
            a /= 10;
        }
        return ans;
    }
};
class Solution {
public:
    string getPermutation(int n, int k) {
        vector <int> nums;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            nums.push_back(i);
            fact *= i;
        }
        k--;
        string ans = "";
        while (n != 0) {
            fact /= n;
            int ind = k / fact;
            k -= ind * fact;
            ans += to_string(nums[ind]);
            nums.erase(nums.begin() + ind);
            n--;
        }
        return ans;
    }
};
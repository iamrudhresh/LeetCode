class Solution {
public:
    int sumOfSquares(vector<int>& nums) {
        int sum=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                sum=sum+(nums[i]*nums[i]);
            }
            
        }
        return sum;
    }
};
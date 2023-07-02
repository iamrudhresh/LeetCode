class Solution {
public:
    int arrangeCoins(int n) {
        int count=1;
        while(n>0){
            if(n>=count){
                n=n-count;
                count++;
            }else{
                n=n-count;
            }
        }
        return count-1;
        
    }
};
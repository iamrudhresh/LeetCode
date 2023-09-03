class Solution {
public:
    int uniquePaths(int m, int n) {
        long long ans=1;
        for(int i=1;i<=m-1;++i){
            ans=ans*(n-1+i)/i;
        }
        return (int)ans;
    }
};
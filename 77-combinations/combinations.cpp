class Solution {
public:
    vector<vector<int>>res;
    void solve1(int num,int tot,int k,vector<int>&ans){
        if(num==tot+1){
            //filter the size of subsequence of size k.
            if(ans.size()==k)
            res.push_back(ans);
            return;
        }

        ans.push_back(num);
        solve1(num+1,tot,k,ans);//take current number
        ans.pop_back();
        solve1(num+1,tot,k,ans);//not take current number
    }
    void solve2(int num,int tot,int k,vector<int>&ans){
      if(ans.size()==k){
      res.push_back(ans);
      return;
      }
      for(int i=num;i<=tot;i++){
          ans.push_back(i);
          solve2(i+1,tot,k,ans);//generating answer in sorted order
// 1  12  123 13 like this
          ans.pop_back();
      }
      
    }
    vector<vector<int>> combine(int n, int k) {
        vector<int>ans;
        solve2(1,n,k,ans);
        return res;
    }
};
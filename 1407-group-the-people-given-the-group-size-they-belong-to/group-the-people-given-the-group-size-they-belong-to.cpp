class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupsizes) {
        unordered_map<int,vector<int>>u;
        for(int i=0;i<groupsizes.size();i++){
            u[groupsizes[i]].push_back(i);
        }
        vector<vector<int>>v;
        for(auto x:u){
            int k=x.first;
           vector<int>f=x.second;
           int c=f.size()/k;
           int l=0;
           for(int i=0;i<c;i++){
                vector<int>ans;
               for(int j=0;j<k;j++){
                ans.push_back(f[l]);
                l++;
               }
               v.push_back(ans);
           }
        }
        return v;
    }
};
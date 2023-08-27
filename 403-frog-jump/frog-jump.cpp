class Solution {
public:
   bool canCross(vector<int>& stones) {
        unordered_map<int, unordered_set<int>> mp;  // check map  
        mp[stones[0]] = {0};
// iterate
        for (int i = 0; i < stones.size(); ++i) {
            int position = stones[i];

            for (auto it : mp[position]) { //for each jump
                for (int jump = it - 1; jump <= it + 1; ++jump) {  // there are 3 possiblity 
				//1 )it-1 
				//2) it 
				//3) it+1
                    if (jump > 0) {  // if possible or reachable
                        mp[stones[i] +  jump].insert(jump); // add in map
                    }
                }
            }
        }

        return !mp[stones.back()].empty();
    }
};
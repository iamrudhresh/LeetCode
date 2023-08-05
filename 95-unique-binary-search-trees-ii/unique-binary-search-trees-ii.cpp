/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
//copyright 2023 mahesh vishnoi
    vector<TreeNode*> generateTrees(int end, int start = 1) {
        vector<TreeNode*> ans;       
        // If start > end, then subtree will be empty so we will directly return null pointer
        if ( start> end)
            return {nullptr};
        
        // Consider every number in range [start, end] as root
        for (int i = start; i <= end; i++) {
            // generate all possible trees in range [start, i)
            for (auto left : generateTrees(i - 1, start)) {
                // generate all possible trees in range (i, end]
                for (auto right : generateTrees(end, i + 1))
                    // make new trees with 'i' as the root
                    ans.push_back(new TreeNode(i, left, right));
            }
        }
        return ans;
    }
};
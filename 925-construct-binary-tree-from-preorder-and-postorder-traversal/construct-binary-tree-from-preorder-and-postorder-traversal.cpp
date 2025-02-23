class Solution {
public:
    vector<int> x2pre, x2post;  // Index mappings for quick lookup

    TreeNode* f(vector<int>& preorder, vector<int>& postorder, int preS, int postS, int postE) {
        if (postS>postE) return NULL;  // Base case
        TreeNode* root=new TreeNode(preorder[preS]);
        if (postS==postE) return root;  // Only 1 node
        
        // Identify left child and find its range in postorder
        int lRoot=preorder[preS+1];  // Left child is next in preorder
        int lrPostIdx=x2post[lRoot];   // Index of left root in postorder

        // Recursively build left and right subtrees
        root->left=f(preorder, postorder, preS+1, postS, lrPostIdx);
        root->right=f(preorder, postorder, x2pre[postorder[postE-1]], lrPostIdx+1, postE-1);

        return root;
    }

    TreeNode* constructFromPrePost(vector<int>& preorder, vector<int>& postorder) {
        const int n = preorder.size();
        x2pre.assign(n+1, -1);
        x2post.assign(n+1, -1);
        
        for (int i=0; i<n; i++) {
            x2pre[preorder[i]]=i;  // Store preorder indices
            x2post[postorder[i]]=i;  // Store postorder indices
        }

        return f(preorder, postorder, 0, 0, n-1);
    }
};



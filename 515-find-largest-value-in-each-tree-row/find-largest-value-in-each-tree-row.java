class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        
        List<Integer> ans = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int currentLength = queue.size();
            int currMax = Integer.MIN_VALUE;
            
            for (int i = 0; i < currentLength; i++) {
                TreeNode node = queue.remove();
                currMax = Math.max(currMax, node.val);
                
                if (node.left != null) {
                    queue.add(node.left);
                }
                
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            
            ans.add(currMax);
        }
        
        return ans;
    }
}
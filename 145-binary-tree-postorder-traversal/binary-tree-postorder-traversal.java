class Solution {
    public static void tree(TreeNode root, List<Integer> l){
        if(root==null) return;
        tree(root.left,l);
        tree(root.right,l);
        l.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        tree(root,l);
        return l;
    }
}
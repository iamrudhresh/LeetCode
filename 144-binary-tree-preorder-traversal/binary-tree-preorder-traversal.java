class Solution {
    public static void tree(TreeNode root, List<Integer> l){
        if(root==null) return;
        l.add(root.val);
        tree(root.left,l);
        tree(root.right,l);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        tree(root,l);
        return l;
    }
}
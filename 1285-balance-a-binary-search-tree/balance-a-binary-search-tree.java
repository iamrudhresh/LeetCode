/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
int makeVine(TreeNode grand) {
  int cnt = 0;
  var n = grand.right;
  while (n != null) {
    if (n.left != null) {
      var old_n = n;
      n = n.left;
      old_n.left = n.right;
      n.right = old_n;
      grand.right = n;
    }
    else {      
        ++cnt;
        grand = n;
        n = n.right;
    }
  }
  return cnt;
}
void compress(TreeNode grand, int m) {
  var n = grand.right;
  while (m-- > 0) {
    var old_n = n;
    n = n.right;
    grand.right = n;
    old_n.right = n.left;
    n.left = old_n;
    grand = n;
    n = n.right;
  }
}    
public TreeNode balanceBST(TreeNode root) {
  TreeNode grand = new TreeNode(0);
  grand.right = root;
  int cnt = makeVine(grand);
  int m = (int)Math.pow(2, (int)(Math.log(cnt + 1) / Math.log(2))) - 1;
  compress(grand, cnt - m);
  for (m = m / 2; m > 0; m /= 2)
    compress(grand, m);
  return grand.right;
}
}
public class RangeSumOfBst_938 {
    int ans;
    public int rangeSumBST(TreeNode root, int L, int R) {
        ans = 0;
        dfs(root, L, R);
        return ans;
    }

    public void dfs(TreeNode node, int L, int R) {
        if (node != null) {
            if (L <= node.val && node.val <= R)
                ans += node.val;
            if (L < node.val)
                dfs(node.left, L, R);
            if (node.val < R)
                dfs(node.right, L, R);
        }
    }
    public static void main(String[] args){
        RangeSumOfBst_938 rs = new RangeSumOfBst_938();
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(2);
        t.right = new TreeNode(6);
        t.left.left = new TreeNode(1);
        System.out.println(rs.rangeSumBST(t, 0, 6));
    }
}

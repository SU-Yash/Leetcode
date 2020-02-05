import apple.laf.JRSUIUtils;

public class SubTreeOfAnotherTree_572 {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        return traverse(s,t);
    }
    public static boolean equals(TreeNode x,TreeNode y)
    {
        if(x==null && y==null)
            return true;
        if(x==null || y==null)
            return false;
        return x.val==y.val && equals(x.left,y.left) && equals(x.right,y.right);
    }
    public static boolean traverse(TreeNode s,TreeNode t)
    {
        return  s!=null && ( equals(s,t) || traverse(s.left,t) || traverse(s.right,t));
    }
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(4);
        t1.right = new TreeNode(5);
        t1.left.left = new TreeNode(1);
        t1.left.right = new TreeNode(2);

        TreeNode t2 = new TreeNode(4);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(2);

        System.out.println(isSubtree(t1, t2));
    }
}

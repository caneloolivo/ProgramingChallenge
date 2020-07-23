import java.util.Stack;

public class PathSumSolution {
	 public static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode() {}
		 TreeNode(int val) { this.val = val; }
		 TreeNode(int val, TreeNode left, TreeNode right) { 
			 this.val = val;
			 this.left = left;
			 this.right = right;
		 }
	 }
	 
	 public boolean hasPathSum(TreeNode root, int sum) {
		 if (root == null)
			 return false;
		 sum -= root.val;
		 if(root.left == null && root.right == null && sum == 0)
			 return true;
		 return (root.left != null && hasPathSum(root.left, sum)) || 
				 (root.right != null && hasPathSum(root.right, sum));
	 }
	 
	 
	 public boolean hasPathSum2(TreeNode root, int sum) {
		 if(root == null)
			 return false;
		 sum -= root.val;
		 
		 if(root.left == null && root.right == null && sum == 0)
			 return true;
		 return(root.left != null && hasPathSum2(root.left, sum))
				 || (root.right != null && hasPathSum2(root.right, sum));
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
		 PathSumSolution solution = new PathSumSolution();
		 TreeNode root = new TreeNode(5, new TreeNode(4), new TreeNode(6));
		 root.left.left = new TreeNode(11,new TreeNode(7), new TreeNode(2));
		 root.right = new TreeNode(6, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)));
		 int sum = 22;
		 boolean result = solution.hasPathSum(root,sum);
		 System.out.println("Tiene la suma "+sum+"? "+ result);
	 }
}

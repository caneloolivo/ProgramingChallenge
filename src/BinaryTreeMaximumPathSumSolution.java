
public class BinaryTreeMaximumPathSumSolution {
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
	 int max;
	public int maxPathSum(TreeNode root) {
		max = Integer.MIN_VALUE;
		maxPathRecursive(root);
		return max;
	}
	
	public int maxPathRecursive(TreeNode root) {
		if(root == null)
			return 0;
		int left = Math.max(maxPathRecursive(root.left) , 0);
		int right = Math.max(maxPathRecursive(root.right), 0);
		max = Math.max(max, root.val + left + right);
		return root.val + Math.max(left, right);
	}
	
	public static void main(String[] args) {
		BinaryTreeMaximumPathSumSolution solution = new BinaryTreeMaximumPathSumSolution();
		TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		int result = solution.maxPathSum(root);
		System.out.println("El resultado de la suma fue " + result);
	}
}

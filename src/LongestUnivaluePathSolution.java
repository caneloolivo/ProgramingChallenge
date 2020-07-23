
public class LongestUnivaluePathSolution {

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
	
	 int result;
	public int longestUnivaluePath(TreeNode root) {
		result = 0;
		getLength(root);
		return result;
    }
	
	public int getLength(TreeNode node) {
		if (node == null) 
			return 0;
		
		int left = getLength(node.left);
		int right = getLength(node.right);
		int arrowLeft = 0, arrowRight = 0;
		
		if(node.left != null && node.left.val == node.val)
			arrowLeft += left +1;
		
		if(node.right != null && node.right.val == node.val)
			arrowRight += right + 1;
		
		result = Math.max(result ,arrowLeft + arrowRight);
	
		return Math.max(arrowLeft, arrowRight);
	}
	
	public static void main(String [] args) {
		LongestUnivaluePathSolution solution = new LongestUnivaluePathSolution();
		TreeNode root = new TreeNode(1, 
				new TreeNode(4, new TreeNode(4), new TreeNode(4)),
				new TreeNode(5, null, new TreeNode(5)));
		int result = solution.longestUnivaluePath(root);
		System.out.println("El path mas largo es " + result);
	}

}

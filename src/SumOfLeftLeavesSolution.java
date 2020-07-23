
public class SumOfLeftLeavesSolution {
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
	 
	 int sum;
	 public int sumOfLeftLeaves(TreeNode root) {
		 if(root!= null) {
			 sumNode(root.left);
			 sumOfLeftLeaves(root.left);
			 sumOfLeftLeaves(root.right);
		 }
		 return sum;
	 }
	 
	 private void sumNode(TreeNode node) {		 
		 if(node != null) {
			 if(node.left == null && node.right == null)
				 sum+= node.val;
		 }
	 }
	 
	 public static void main(String[] args) {
		 SumOfLeftLeavesSolution solution = new SumOfLeftLeavesSolution();
		 TreeNode root = new TreeNode(3);
		 root.left = new TreeNode(9);
		 root.right = new TreeNode(20);
		 root.right.left = new TreeNode(15);
		 root.right.right = new TreeNode(7);
		 int result = solution.sumOfLeftLeaves(root);
		 System.out.println("El resultado es" + result);
	 }
}

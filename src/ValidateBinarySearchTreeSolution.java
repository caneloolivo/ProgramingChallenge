import java.util.Stack;

public class ValidateBinarySearchTreeSolution {
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
	 public boolean isValidBST(TreeNode root) {
		 Stack<TreeNode> stack = new Stack<TreeNode>();
		 double inOrder = -Double.MAX_VALUE;		 
		 while(!stack.isEmpty() || root != null) {
			 while(root != null) {
				 stack.push(root);
				 root = root.left;
			 }
			 root = stack.pop();
			 if(root.val <= inOrder)
				 return false;
			 inOrder = root.val;
			 root = root.right;
		 }
		return true;
	 }	 
	 public boolean isValidBST2(TreeNode root) {
		    Stack<TreeNode> stack = new Stack();
		    double inorder = - Double.MAX_VALUE;

		    while (!stack.isEmpty() || root != null) {
		      while (root != null) {
		        stack.push(root);
		        root = root.left;
		      }
		      root = stack.pop();
		      // If next element in inorder traversal
		      // is smaller than the previous one
		      // that's not BST.
		      if (root.val <= inorder) return false;
		      inorder = root.val;
		      root = root.right;
		    }
		    return true;
		  }
	 
	 public static void main(String[] args) {
		 ValidateBinarySearchTreeSolution solution = new ValidateBinarySearchTreeSolution();
		 TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		boolean result = solution.isValidBST(root);
		System.out.println("Es un árbol válido?" + result);
	 }
}

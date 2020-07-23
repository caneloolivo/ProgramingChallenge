import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversalSolution {
	public class TreeNode {
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
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		getValues(root, result);
		return result;
    }
	
	public void getValues(TreeNode root, List<Integer> list) {
		if(root != null) {
			getValues(root.right, list);
			getValues(root.left, list);
			list.add(root.val);
		}
	}
}

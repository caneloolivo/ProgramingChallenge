import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalSolution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		inOrder(root, result);
		return result;
    }
	
	public void inOrder(TreeNode root, List<Integer> list) {
		if(root != null) {
			inOrder(root.left, list);
			list.add(root.val);
			inOrder(root.right, list);
		}
	}
	
	public List<Integer> inorderTraversal2(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		inOrder(root, result);
		return result;
    }
	
}

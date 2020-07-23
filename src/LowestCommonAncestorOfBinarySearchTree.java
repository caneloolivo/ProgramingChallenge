import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestorOfBinarySearchTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int rootVal = root.val;
		int pVal = p.val;
		int qVal = q.val;
		if(pVal > rootVal && qVal > rootVal) {
			return lowestCommonAncestor(root.right, p, q);
		}
		else if(pVal < rootVal && qVal < rootVal) {
			return lowestCommonAncestor(root.left, p, q);			
		}
		else
			return root;
	}
	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {		
		int pVal = p.val;
		int qVal = q.val;
		TreeNode node = root;
		while(root != null) {
			int rootVal = root.val;
			if(pVal > rootVal && qVal > rootVal) {				
				node = node.right;
			}
			else if(pVal < rootVal && qVal < rootVal) {
				node = node.left;
			}
			else
				return node;
			}
		return null;
	}
}

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTreeSolution {	
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public boolean isSymmetric(TreeNode root) {	
		if (root == null)
			return true;
		return isSameNode(root.left, root.right);
    }
	
	public boolean isSameNode(TreeNode l, TreeNode r) {
		if(l != null && r != null) {
			if(l.val == r.val) {
				return isSameNode(l.left, r.right) &&
						isSameNode(r.left, l.right);
			}
			else {
				return false;
			}
		}
		else if(l == null && r == null) 
			return true;
		else
			return false;
	}
	
	public boolean isSymmetric2(TreeNode root) {	
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		nodes.add(root);
		nodes.add(root);
		while(!nodes.isEmpty()) {
			TreeNode n1 = nodes.poll();
			TreeNode n2 = nodes.poll();
			if(n1 == null && n2 == null)
                continue;
			if(n1 == null || n2 == null)
				return false;
			else if(n1.val != n2.val)
				return false;
			nodes.add(n1.left);
			nodes.add(n2.right);
			nodes.add(n1.right);
			nodes.add(n2.left);
		}
		return true;
    }
	public boolean isSymmetric3(TreeNode root) {
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		nodes.offer(root);
		nodes.offer(root);
		while(!nodes.isEmpty()) {
			TreeNode n1 = nodes.poll();
			TreeNode n2 = nodes.poll();
			if(n1 == null && n2 == null)
				continue;
			else if(n1 == null || n2 == null)
				return false;
			else if(n1.val != n2.val)
				return false;
			nodes.offer(n1.left);
			nodes.offer(n2.right);
			nodes.offer(n2.left);
			nodes.offer(n1.right);
		}
		return true;
	}
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(2);
		node.left.left = new TreeNode(3);
		node.left.right = new TreeNode(4);
		node.right.left = new TreeNode(4);
		node.right.right = new TreeNode(3);
	}
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversalSolution {
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
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null)
			return result;		
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		nodes.offer(root);
		boolean isLeft = true;
		while(!nodes.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>();
			int size = nodes.size();
			while (size >0) {
				TreeNode node = nodes.poll();
				if(isLeft)
					level.add(0, node.val);
				else
					level.add(node.val);
				if(node.left != null)
					nodes.offer(node.left);
				if(node.right != null)
					nodes.offer(node.right);				
				size--;
			}
			isLeft = !isLeft;
			result.add(level);
		}
		return result;
	}
}

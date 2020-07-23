import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalSolution {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		nodes.add(root);
		while(!nodes.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>();
			int size = nodes.size();
			while(size > 0) {
				TreeNode levelNode = nodes.poll();
				level.add(levelNode.val);
				if(levelNode.left != null)
					nodes.add(levelNode.left);
				if(levelNode.right != null)
					nodes.add(levelNode.right);
				size--;
			}			
			result.add(level);
		}
		return result;
    }	
	public List<List<Integer>> levelOrder2(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null)
			return result;
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		nodes.offer(root);
		while(!nodes.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>();
			int size = nodes.size();
			while(size > 0) {
				TreeNode node = nodes.poll();
				level.add(node.val);
				if(node.left != null)
					nodes.offer(node.left);
				if(node.right != null)
					nodes.offer(node.right);
				size--;
			}
			result.add(level);
		}
		return result;
	}
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(9);
		node.right = new TreeNode(20);
		node.right.left = new TreeNode(15);
		node.right.right = new TreeNode(7);
		
		BinaryTreeLevelOrderTraversalSolution solution 
		= new BinaryTreeLevelOrderTraversalSolution();
		List<List<Integer>> result = solution.levelOrder(node);
		System.out.println("El resultado es " + String.valueOf(result));
	}
}

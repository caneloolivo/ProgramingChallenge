import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FindBottomLeftTreeValueSolution {
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
	 
	public int findBottomLeftValue(TreeNode root) {
		int result = 0;	
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		nodes.offer(root);
		while(!nodes.isEmpty()) {
			int size = nodes.size();
			while(size > 0) {
				TreeNode node = nodes.poll();
				result = node.val;
				if(node.right != null)
					nodes.offer(node.right);
				if(node.left != null) 
					nodes.offer(node.left);					
				size--;
			}
		}
		return result;		
    }
	
	
	
	
	
	
	
	
	int maxDepth = 0, result = 0;
	public int findBottomLeftValue2(TreeNode root) {
		dfs(root, 1);
		return result;
    }
	
	
	public void dfs(TreeNode root, int depth) {
		if(root != null) {
			if(root.left == null && root.right == null && depth > maxDepth) {
				result = root.val;
				maxDepth = depth;
			}
			dfs(root.left, depth +1);
			dfs(root.right, depth +1);
		}
	}
	
	
	public static void main(String[] args) {
		FindBottomLeftTreeValueSolution solution = new FindBottomLeftTreeValueSolution();
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(-1);
		int reuslt = solution.findBottomLeftValue(root);
		System.out.println("El resultado es " + reuslt);
	}
}

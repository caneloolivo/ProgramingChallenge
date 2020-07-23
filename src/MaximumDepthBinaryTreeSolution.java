import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTreeSolution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public int maxDepth(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.offer(root);
        while(!nodes.isEmpty()) {
        	int size = nodes.size();
        	while(size > 0) {
        		TreeNode node = nodes.poll();
        		if(node.left!= null)
        			nodes.offer(node.left);
        		if(node.right != null)
        			nodes.offer(node.right);
        		size--;
        	}
        	depth++;
        }
        return depth;
    }
}

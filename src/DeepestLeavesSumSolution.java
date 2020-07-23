import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DeepestLeavesSumSolution {
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
	public int deepestLeavesSum(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.offer(root);
        List<Integer> result = new ArrayList<Integer>();
        while(!nodes.isEmpty()) {
        	int size = nodes.size();
        	result.clear();
        	while(size > 0) {        		
        		TreeNode node = nodes.poll();
        		result.add(node.val);
        		if(node.left != null)
        			nodes.offer(node.left);
        		if(node.right != null)
        			nodes.offer(node.right);
        		size--;
        	}
        }
        for(int num: result)
        	sum+=num;
        return sum;
    }
	
	public static void main(String arg[]) {
		DeepestLeavesSumSolution solution = new DeepestLeavesSumSolution();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2); 
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(7);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(6);
		root.right.right.right = new TreeNode(8);
		int result = solution.deepestLeavesSum(root);
		System.out.print("El resultado de la suma fue: "+ result);
	}
}

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PathSumIISolution {
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
	 
	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
	        Queue<TreeNode> qNode = new LinkedList<TreeNode>();
	        Queue<Integer> qSum = new LinkedList<Integer>();
	        Queue<List<Integer>> qList = new LinkedList<List<Integer>>();	        
	        if (root==null) 
	        	return result;
	        qNode.add(root);
	        qSum.add(sum);
	        qList.add(new LinkedList<Integer>());
	        
	        while (!qNode.isEmpty()) {
	            TreeNode curNode=qNode.poll();
	            int curSum=qSum.poll();
	            List<Integer> curList=qList.remove();
	            
	            curList.add(curNode.val);
	            
	            if (curNode.left == null && curNode.right == null && curNode.val == curSum) 
	                result.add(new LinkedList<Integer>(curList));
	            if (curNode.left != null) {
	                qNode.add(curNode.left);
	                qSum.add(curSum-curNode.val);
	                qList.add(new LinkedList<Integer>(curList));
	            }
	            if (curNode.right != null) {
	                qNode.add(curNode.right);
	                qSum.add(curSum-curNode.val);
	                qList.add(new LinkedList<Integer>(curList));
	            }
	        }
	        return result;
	 }
	 
	 public List<List<Integer>> pathSum2(TreeNode root, int sum) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if(root == null)
	        	return result;
	        Queue<TreeNode> nodes = new LinkedList<>();
	        Queue<Integer> totalSum = new LinkedList<>();
	        Queue<List<Integer>> lists = new LinkedList<>();	        
	        nodes.offer(root);
	        totalSum.offer(sum);
	        lists.offer(new ArrayList<>());
	        while(!nodes.isEmpty()){
	        	TreeNode node = nodes.poll();
	        	int tmpSum = totalSum.poll();
	        	List<Integer> tmpList = lists.poll();
	        	tmpList.add(node.val);
	        	
	        	if(node.left == null && node.right == null && node.val == tmpSum)
	        		result.add(tmpList);
	        	
	        	if(node.left != null) {
	        		nodes.offer(node.left);
	        		totalSum.offer(tmpSum - node.val);
	        		lists.offer(new ArrayList<Integer>(tmpList));
	        	}
	        	
	        	if(node.right != null) {
	        		nodes.offer(node.right);
	        		totalSum.offer(tmpSum - node.val);
	        		lists.offer(new ArrayList<Integer>(tmpList));
	        	}
	        	
	        }
	        return result;
	    }
	 
	 public static void main(String [] args) {		 
		 PathSumIISolution solution = new PathSumIISolution();
		 int sum = 22;
		 TreeNode root = 
			new TreeNode(5, 
			new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), 
			new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
		 List<List<Integer>> result = solution.pathSum(root, sum);
		 System.out.println("Los valores" + String.valueOf(result));
	 }
}

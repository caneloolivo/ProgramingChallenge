import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenBSTNodesSolution {
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
	
	public int minDiffInBST(TreeNode root) {
		int min = Integer.MAX_VALUE;
		List<Integer> values = new ArrayList<Integer>();
		getValues(root, values);
		for(int i = 0; i < values.size()-1; i++) {
			min = Math.min(min, values.get(i +1) - values.get(i));
		}
        return min;
    }
	
	public void getValues(TreeNode root, List<Integer> values) {
		if(root != null) {
			getValues(root.left, values);
			values.add(root.val);			
			getValues(root.right, values);
		}
	}
	
	
	public int minDiffInBST2(TreeNode root) {
        int min = Integer.MAX_VALUE;
        List<Integer> values = new ArrayList<>();
        getValuesBinaryTree(root, values);
        for(int i = 0; i < values.size() -1; i++) {
        	min = Math.min(min, values.get(i + 1) - values.get(i) );
        }
        return min;
    }
	
	public void getValuesBinaryTree(TreeNode root, List<Integer> values) {
		if(root != null) {
			getValuesBinaryTree(root.left, values);
			values.add(root.val);
			getValuesBinaryTree(root.right, values);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

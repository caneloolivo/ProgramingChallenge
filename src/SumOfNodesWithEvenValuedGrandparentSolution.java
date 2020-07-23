public class SumOfNodesWithEvenValuedGrandparentSolution {
		
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}	
	int sum;
	public int sumEvenGrandparent(TreeNode root) {
		 sum = 0;
		 sumNodes(root, -1);
		return sum;
    }
	
	public void sumNodes(TreeNode node, int parent) {
		if(node != null) {
			if(parent %2 == 0) {
				if(node.left != null) {
					sum += node.left.val;
				}
				if(node.right != null) {
					sum += node.right.val;
				}				
			}
			sumNodes(node.left, node.val);
			sumNodes(node.right, node.val);
		}		
	}
	
	public static void main(String[] args) {
		SumOfNodesWithEvenValuedGrandparentSolution solution = 
				new SumOfNodesWithEvenValuedGrandparentSolution();
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(7);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);
		root.left.left.left = new TreeNode(9);
		root.left.right.left = new TreeNode(1);		
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(3);
		root.right.right = new TreeNode(5);
		int result = solution.sumEvenGrandparent(root);
		System.out.println("Mira salio" + result);
	}
}

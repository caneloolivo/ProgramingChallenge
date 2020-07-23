
public class ConvertSortedArrayBinarySearchTree {
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
	 public TreeNode sortedArrayToBST(int[] nums) {
		 if(nums.length == 0)
			 return null;
		 return createBST(nums, 0, nums.length-1);
	 }
	 
	 public TreeNode createBST(int[] arr, int l, int r) {
		 int m = l +(r-l)/2;
		 while(l<=r) {
			 TreeNode node = new TreeNode(arr[m]);
			 node.left = createBST(arr, l, m-1);
			 node.right = createBST(arr, m+1, r);
			 return node;
		 }
		 return null;
	 }
}

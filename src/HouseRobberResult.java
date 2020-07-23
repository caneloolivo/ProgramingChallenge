
public class HouseRobberResult {
	public int rob(int[] nums) {
		if(nums == null || nums.length == 0) 
			return 0;
		if(nums.length == 1)
			return nums[0];
		int n = nums.length;
		int [] result = new int[n];
		result[0] = nums[0];
		result[1] = Math.max(nums[0], nums[1]);
		for(int i = 2; i < n; i++) {
			result[i] = Math.max(result[i-2] + nums[i], result[i-1]);
		}
		return result[n-1];
	}
}

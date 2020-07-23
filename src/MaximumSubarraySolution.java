
public class MaximumSubarraySolution {
	public int maxSubArray(int[] nums) {
		int n = nums.length;
		int max = nums[0];
		int tmpMax = nums[0];
		
		for(int i = 1; i< n; i++) {
			tmpMax = Math.max(tmpMax + nums[i],  nums[i]);
			max = Math.max(max, tmpMax);
		}
        return max;
    }
}

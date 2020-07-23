
public class LongestIncreasingSubsequenceSolution {
	public int lengthOfLIS(int[] nums) {		
		if(nums == null || nums.length == 0)
			return 0;
		
		int max = 1;
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = max;
		for(int i = 1; i < max; i ++) {
			int currentMax = 0;
			for(int j = 0; j < i; j++) {
				if(dp[i] > dp[j])
					currentMax = Math.max(currentMax, dp[j]);
			}
			dp[i] = 1 + currentMax;
			max = Math.max(max, dp[i]);
		}
        return max;
    }
}

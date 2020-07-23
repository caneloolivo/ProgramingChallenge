import java.util.Arrays;

public class ThreeSumClosestSolution {
	public int threeSumClosest(int[] nums, int target) {
		int result = Integer.MAX_VALUE, n = nums.length;
		Arrays.parallelSort(nums);
		for(int i = 0; i < n && result != 0; i++) {
			int l = i +1, r = n-1;
			while(l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if(Math.abs(target- sum) < Math.abs(result))
					result = target - sum;
				if(sum < target)
					l++;
				else 
					r--;
			}
		}
		return target - result;
    }
}

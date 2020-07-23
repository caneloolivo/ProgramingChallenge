
public class ShuffleArraySolution {
	public int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int [] result = new int[length];
        int j = 0;
        for(int i = 0; i< n; i++) {
        	result[j++] = nums[i];
        	result[j++] = nums[i + n];
        }
        return result;
    }
}

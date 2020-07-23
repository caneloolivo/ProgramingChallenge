
public class NonDecreasingArraySolution {
	public boolean checkPossibility(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			if( nums[i] > nums[i + 1] ) {
				count++;
				nums[i] = nums[i +1];
			}				
		}
		return count < 2;
    }
	
	public static void main(String[] args) {
		NonDecreasingArraySolution solution = new NonDecreasingArraySolution();
//		int [] nums = {4,2,1};
//		int [] nums = {3,4,2,3};
		int [] nums = {2,3,3,2,4};

		boolean isDescending = solution.checkPossibility(nums);
		System.out.println("Is descending" + isDescending);
	}
}

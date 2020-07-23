
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int count = 0;
		for(int i = 0; i< nums.length; i++) {
			if(nums[count] != nums[i]) {
				count++;
				nums[count] = nums[i];				
			}
		}
		return count + 1;
    }
	
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
		int nums[] = {1,1,2};
		int result = solution.removeDuplicates(nums);
		for(int i = 0; i < result; i ++) {
			System.out.print(nums[i] +",");
		}
		
	}
}

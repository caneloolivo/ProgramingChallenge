public class FindFirstAndLastPositionOfElement {
	public int[] searchRange(int[] nums, int target) {
		int[] result = new int[2];
		if(nums.length ==1) {
			if(nums[0]== target)
				return result;
		}		
		int y =0;
		boolean isFound= false;
		for(int x = 0; x <nums.length; x++ ) {
			if(nums[x] == target) {
				isFound= true;
				result[y] = x;
				if (y==0) y++;			
				if(result[y] == 0)
					result[y] = x;
			}
		}
		if(!isFound) {
			for(int x = 0;x<2; x++)			
				result[x]= -1;
		}
		return result;
    }
	
	public static void main(String[] args) {
		FindFirstAndLastPositionOfElement solution = new FindFirstAndLastPositionOfElement();

		int[] nums = {5,7,7,8,8,10};
		int target = 6;
		int[] result = solution.searchRange(nums, target);
		for(int x: result)
			System.out.print(x+" " );
	}
}

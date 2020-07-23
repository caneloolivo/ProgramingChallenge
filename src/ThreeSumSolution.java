import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSolution {
	public List<List<Integer>> threeSum(int[] nums) {
		int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if(n < 3)
        	return result;
        Arrays.sort(nums);        
        for(int i = 0; i < n -2; i++) {
        	if(i == 0 || (i > 0 && nums[i] != nums[i -1])) {
        		int low = i+1;
        		int high = n -1;
        		int sum = 0 - nums[i];
        		while(low < high) {
        			if(nums[low] + nums[high] == sum) {
        				result.add(Arrays.asList(nums[i], nums[low], nums[high]));
        				while(low < high && nums[low] == nums[low+1]) 
        					low++;
                        while(low < high && nums[high] == nums[high-1]) 
                        	high--;
                        low++;
                        high--;
                    }
                    else if(nums[low] + nums[high] > sum){
                        high--;
                    }
                    else{
                        low++;
                    }        			
        		}
        	}
        }
        return result;
    }
	
	public static void main(String[] args) {
		ThreeSumSolution solution = new ThreeSumSolution();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = solution.threeSum(nums);
		System.out.println("El resultado fue " + String.valueOf(result));
	}
}

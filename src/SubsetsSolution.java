import java.util.ArrayList;
import java.util.List;

public class SubsetsSolution {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        recursion(result, tmp, nums, 0);
        return result;
    }
	
	void recursion(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
		result.add(new ArrayList<Integer>(temp));
		for(int i = start; i < nums.length; i++) {
			temp.add(nums[i]);
			recursion(result, temp, nums, i);			
		}	temp.add(temp.size()-1);	
	}
}

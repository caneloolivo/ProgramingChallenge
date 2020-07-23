import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumberSolution {
	public int findDuplicate(int[] nums) {
		Set<Integer> noDuplicateNums = new HashSet<Integer>();
		for(int num: nums) {
			if(noDuplicateNums.contains(num))
				return num;
			noDuplicateNums.add(num);
		}
		return 0;
    }
	
	public static void main(String[] args) {
		FindTheDuplicateNumberSolution solution= new FindTheDuplicateNumberSolution();
		int[] nums = {1,3,4,2,2};
		int result = solution.findDuplicate(nums);
		System.out.println("El duplicado es "+ result);
	}
}

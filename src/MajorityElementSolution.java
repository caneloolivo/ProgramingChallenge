import java.util.HashMap;

public class MajorityElementSolution {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: nums)
			map.put(num, map.getOrDefault(num, 0)+1);
		int majority = nums.length/2;
		int result = majority;
		for(int key : map.keySet()) {
			if(majority < map.get(key))
				result = key;
		}
		return result;
    }
}

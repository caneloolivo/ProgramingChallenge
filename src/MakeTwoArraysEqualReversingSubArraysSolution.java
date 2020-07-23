import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MakeTwoArraysEqualReversingSubArraysSolution {
	public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.parallelSort(target);
        Arrays.parallelSort(arr);
		return Arrays.equals(target, arr);
    }
	public boolean canBeEqual2(int[] target, int[] arr) {
		if (target.length != arr.length)
			return false;
		Set<Integer> number = new HashSet<Integer>();
		for(int num: arr)
			number.add(num);
		for(int num :target) {
			if(!number.contains(num))
				return false;
		}
		return true;
    }
}

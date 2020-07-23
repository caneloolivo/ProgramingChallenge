import java.util.List;
import java.util.ArrayList;

public class CreateTargetArrayGivenOrderSolution {
	public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<Integer>();
        for(int x = 0; x< index.length; x++) {
        	result.add(index[x], nums[x]);
        }
        return result.stream().mapToInt(i-> i).toArray();
    }
}

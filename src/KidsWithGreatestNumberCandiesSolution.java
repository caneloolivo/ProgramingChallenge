import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandiesSolution {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<Boolean>();
		int max = Integer.MIN_VALUE;
		for(int candy: candies)
			max = Math.max(max, candy);
		for(int candy: candies) {
			result.add(candy + extraCandies > max);
		}
		return result;
    }
}

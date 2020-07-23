	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PancakeSortingSolution {
	public List<Integer> pancakeSort(int[] A) {
		List<Integer> result = new ArrayList<Integer>();
		int[] aClone = A.clone();
		Arrays.parallelSort(aClone);
		while(!Arrays.equals(aClone, A)) {
			int tmp = A[A.length-1];
			A[0]= A[tmp-1];
			A[tmp-1]= tmp;
			result.add(tmp);
		}
		return result;
    }
	
	public static void main(String[] args) {
		PancakeSortingSolution solution = new PancakeSortingSolution();
		int[] A = {3,2,4,1};
		List<Integer> result = solution.pancakeSort(A);
		System.out.println(String.valueOf(result));
	}
}

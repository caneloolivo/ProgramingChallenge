import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArraySolution {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int last = arr1.length - 1;
		int [] result = new int[last + 1];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: arr2)
			map.put(num, 0);
		
		for(int num : arr1) {
			if(map.containsKey(num))
				map.put(num, map.get(num)+1);
			else
				result[last--] = num;
		}
		
		int p = 0;
		for(int key : arr2) {
			int n = map.get(key);
			for(int i = 0; i < n; i++) {
				result[p++] = key;
			}
		}
		
		Arrays.sort(result, p, result.length);
        return result;               
    }
	public static void main(String[] args) {
    	RelativeSortArraySolution solution = new RelativeSortArraySolution();
    	int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
    	int [] result = solution.relativeSortArray(arr1, arr2);
    	for(int num : result)
    		System.out.print(num + " ");
    }
}

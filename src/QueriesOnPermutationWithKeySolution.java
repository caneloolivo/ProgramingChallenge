import java.util.ArrayList;
import java.util.List;

public class QueriesOnPermutationWithKeySolution {
	public int[] processQueries(int[] queries, int m) {
		int[] result = new int[queries.length];
		List<Integer> positions = new ArrayList<Integer>();
		for(int x = 1; x< m+1; x++) 
			positions.add(x);
		
		for(int x= 0; x < queries.length; x++) {
			result[x] = positions.indexOf(queries[x]);
			positions.remove(result[x]);
			positions.add(0, queries[x]);
		}
			
		return result;
    }
	
	public static void main (String[] args) {
		QueriesOnPermutationWithKeySolution solution = new QueriesOnPermutationWithKeySolution();
		int[] queries = {3,1,2,1};
		int result[] = solution.processQueries(queries, 5);
		for(int x: result)
			System.out.print(x + " ");
	}
	
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoCitySchedulingSolution {
	public int twoCitySchedCost(int[][] costs) {
		int cost = 0;
		List<Integer> costA = new ArrayList<>();
		List<Integer> costB = new ArrayList<>();
		for(int[] c: costs) {
			if(c[0] < c[1]) {
				cost += c[0];
				costA.add(c[1] - c[0]);
			}
			else {
				cost+= c[1];
				costB.add(c[0] - c[1]);
			}
		}
		if(costA.size() > costB.size()) {
			Collections.sort(costA);
			for(int i = 0; i< costA.size() - (costs.length/2); i++ )
				cost+= costA.get(i);
		}
		else if(costB.size() > costA.size()) {
			Collections.sort(costB);
			for(int i = 0; i< costB.size() - (costs.length/2); i++ )
				cost+= costB.get(i);
		}
		return cost;
	}
	
	public static void main(String[] args) {
		TwoCitySchedulingSolution solution = new TwoCitySchedulingSolution();
		int costs[][] = {{10,20},{30,200},{400,50},{30,20}};
		int result = solution.twoCitySchedCost(costs);
		System.out.println("El resultado fue " + result);
				
	}
}

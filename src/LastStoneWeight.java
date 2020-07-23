import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int stone : stones) 
			pq.offer(stone);
		while(!pq.isEmpty()) {
			int y = pq.poll();
			if(pq.isEmpty())
				return y;
			int x = pq.poll();
			if(x == y) continue;
			else
				pq.offer(y-x);
		}
		return 0;
    }
	
	public static void main(String[] args) {
		LastStoneWeight solution = new LastStoneWeight();
		int[] stones = {2,7,4,1,8,1};
		int weight = solution.lastStoneWeight(stones);
		System.out.println("El peso es de " + weight);
	}
}

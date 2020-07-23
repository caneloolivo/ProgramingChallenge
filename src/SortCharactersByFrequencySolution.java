import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequencySolution {
	public String frequencySort(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder result = new StringBuilder();
		for(char c : s.toCharArray())
			map.put(c, map.getOrDefault(c, 0) +1 );
		
		PriorityQueue<Character> pq = 
				new PriorityQueue((a,b) -> map.get(b) - map.get(a));
		for(char c : map.keySet())
			pq.add(c);		
		
		while(!pq.isEmpty()) {
			char key = pq.poll();
			int n = map.get(key);
			for(int i = 0; i < n; i++)
				result.append(key);
		}
		return result.toString();
    }
	
	public static void main(String[] args) {
		SortCharactersByFrequencySolution solution = new SortCharactersByFrequencySolution();
		String s = "Aabb";
		String result = solution.frequencySort(s);
		System.out.println("El orden correcto es " + result);
	}
}

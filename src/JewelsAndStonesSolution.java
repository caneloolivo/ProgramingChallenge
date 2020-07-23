import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsAndStonesSolution {
	public int numJewelsInStones(String J, String S) {
		int count = 0;
		Set<Character> stones = new HashSet<Character>();
		for(char j: J.toCharArray())
			stones.add(j);
		for(char s: S.toCharArray()) {
			if(stones.contains(s))
				count++;
		}
		return count;
	}
	
	public int numJewelsInStones2(String J, String S) {
		int count = 0;
		int [] jewels = new int['z' - 'A' +1];
		for(int i = 0; i< J.length(); i++) {
			jewels[J.charAt(i) - 'A'] = 1; 
		}
		for(int i = 0; i < S.length(); i++) {
			count += jewels[S.charAt(i) - 'A'];
		}
		return count;
	}
	
	public int numJewelsInStones3(String J, String S) {
		int count = 0;
		HashMap<Character, Integer> jewels = new HashMap<Character, Integer>();
		for(int i = 0; i<J.length(); i++)
			jewels.put(J.charAt(i), 1);
		
		for(char s: S.toCharArray()) {
			if(jewels.containsKey(s))
				count += jewels.get(s);
		}
		return count;
	}
	
	public int numJewelsInStones4(String J, String S) {
		int count = 0;
		HashMap<Character, Integer> jewels = new HashMap<Character, Integer>();
		for(int i = 0; i<J.length(); i++)
			jewels.put(J.charAt(i), i);
		
		for(char s: S.toCharArray()) {
			if(jewels.containsKey(s))
				count ++;
		}
		return count;
	}
	
	public static void main(String args[]) {
		JewelsAndStonesSolution solution = new JewelsAndStonesSolution();
		String J = "aA", S = "aAAbbbb";
		int result = solution.numJewelsInStones3(J, S);
		System.out.println("El resultado es " + result);
	}
}

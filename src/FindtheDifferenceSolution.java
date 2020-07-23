import java.util.HashMap;

public class FindtheDifferenceSolution {
	public char findTheDifference(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < t.length(); i ++) {
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) +1);
		}
		
		for(int i = 0; i < s.length(); i ++) {
			map.put(s.charAt(i), map.get(s.charAt(i)) -1);
		}		
		
		for(char c : map.keySet()) {
			if(map.get(c) == 1)
				return c;
		}
		return ' ';
    }
	
	public static void main(String[] args) {		
		FindtheDifferenceSolution solution = new FindtheDifferenceSolution();
		char result = solution.findTheDifference("ae","aea");
		System.out.println("El que se agrego fue: " + result);
	}
}

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagramSolution {
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b);
    }
	public boolean isAnagram2(String s, String t) {
		if(s.length() != t.length())
			return false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			map.putIfAbsent(s.charAt(i), 0);
			map.put(s.charAt(i) ,map.get(s.charAt(i))+ 1);
		}
		for(char c: t.toCharArray()) {
			if(!map.containsKey(c))
				return false;
			map.put(c, map.get(c)-1);
			if(map.get(c) == 0)
				map.remove(c);		
		}
		return true;
    }
	
	public boolean isAnagram3(String s, String t) {
		if(s.length() != t.length())
			return false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i ++) {
			map.putIfAbsent(s.charAt(i), 0);
			map.put(s.charAt(i), map.get(s.charAt(i)) +1);
			map.putIfAbsent(t.charAt(i), 0);
			map.put(t.charAt(i), map.get(t.charAt(i)) -1);			
		}		
		for(char c: map.keySet()) {
			if(map.get(c) != 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		ValidAnagramSolution solution = new ValidAnagramSolution();
		
		System.out.println("Esto es un anagrama "+
		solution.isAnagram3("anagram", "nagaram"));		
	}
}

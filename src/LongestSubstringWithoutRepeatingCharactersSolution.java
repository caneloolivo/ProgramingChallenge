import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharactersSolution {
	public int lengthOfLongestSubstring(String s) {
		HashSet<Character> result = new HashSet<Character>();
		int answ = 0, i= 0, j= 0 ;
		 while(i<s.length() &&  j< s.length()){
			if(result.contains(s.charAt(j)))
				result.remove(s.charAt(i++));
			else {
				result.add(s.charAt(j++));
				answ = Math.max(answ, j-i);
			}
		}
		return answ;
    }
	
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharactersSolution solution = 
				new LongestSubstringWithoutRepeatingCharactersSolution();
		System.out.println(
				"Me salio "+ solution.lengthOfLongestSubstring("abcabcbb"));
	}
}

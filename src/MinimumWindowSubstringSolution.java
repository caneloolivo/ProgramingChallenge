
public class MinimumWindowSubstringSolution {
	public String minWindow(String s, String t) {	        
		StringBuilder ls = new StringBuilder(s);
		char lastChar = ' ';
		
		System.out.println(s.contains(t));
		while(String.valueOf(ls).contains(t)) {
			lastChar = ls.charAt(0) ;
			ls.deleteCharAt(0);
		}		
		ls.insert(0, lastChar);
		StringBuilder rS = new StringBuilder(s);
		while(String.valueOf(rS).contains(t)) {
			lastChar = rS.charAt(rS.length()-1);
			rS.deleteCharAt(rS.length()-1);
		}
		rS.append(lastChar);
		if(ls.length()> rS.length())
			return String.valueOf(rS);
		else
			return String.valueOf(ls);
	}
	
	public static void main(String[] args) {
		MinimumWindowSubstringSolution solution = new MinimumWindowSubstringSolution();
		String S = "ADOBECODEBANC", T = "ABC";
		String result = solution.minWindow(S, T);
		System.out.println("El resultado menor fueee "+ result);
	}
	 
}

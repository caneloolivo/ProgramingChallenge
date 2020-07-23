import java.util.Stack;

public class ReverseVowelsStringSolution {
	public String reverseVowels(String s) {
		char[] result = s.toCharArray();
		Stack<Character> volwes = new Stack<Character>();
		for(char c: s.toCharArray()) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
					||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				volwes.push(c);
		}
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
					||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				c = volwes.pop();
				result[i] = c;
			}
						
		}		
		return String.valueOf(result);
    }
	
	public String reverseVowels2(String s) {
		char[] result = s.toCharArray();
		int l = 0, r = s.length()-1;
		while(r > l) {
			if(isVowel(s.charAt(l)) && isVowel(s.charAt(r))) {
				result[l] = result[r];
				result[r] = s.charAt(l);
				l++;
				r--;
			}
			else if(!isVowel(s.charAt(l)))
				l++;
			else if(!isVowel(s.charAt(r)))
				r--;
		}							
		return String.valueOf(result);
    }
	
	private boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
	
	public static void main (String[] args) {
		ReverseVowelsStringSolution solution = new ReverseVowelsStringSolution();
		String s = "aA";
		String result = solution.reverseVowels2(s);
		System.out.println("El resultado de " +s +" es " +result);
	}
}

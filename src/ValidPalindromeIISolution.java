
public class ValidPalindromeIISolution {
	public boolean validPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		for(int x = 0;x< s.length(); x++) {
			char c = s.charAt(x);
			sb.deleteCharAt(x);
			if(isPalindrome(sb))
				return true;
			sb.insert(x, c);
		}
		return isPalindrome(s);
    }
	
	private boolean isPalindrome(CharSequence s) {
		int l = 0, r = s.length()-1;
		while(l<=r) {
			if(s.charAt(l++)!= s.charAt(r--))
				return false;			
		}
		return true;
	}
	
    public boolean validPalindrome2(String s) {
        return isValid(s, 0, s.length()-1, true);
    }
    
    private boolean isValid(String s, int l, int r, boolean allowMistake) {
        for (; l < r; l++, r--) {
            if (s.charAt(l) != s.charAt(r)) {
                return allowMistake ? (isValid(s, l+1, r, false) || isValid(s, l, r-1, false)) : false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		ValidPalindromeIISolution solution = new ValidPalindromeIISolution();
		boolean result = solution.validPalindrome("aba");
		System.out.println("Es valido? "+ result);
	}
}

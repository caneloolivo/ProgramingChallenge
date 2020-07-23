
public class ValidPalindromeSolution {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		String converter = "";
		for(int x=0; x< s.length(); x++) {
			if((s.charAt(x)>= 'a' && s.charAt(x)<='z')
					|| (s.charAt(x)>= '0' && s.charAt(x)<= '9'))
				converter += s.charAt(x);
		}
		int l = 0;
		int r = converter.length()-1;
		while (r>= l) {
			if(converter.charAt(l) != converter.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
    }	
	
	public boolean isPalindrome2(String s) {
		s = s.toLowerCase();
		int l = 0, r = s.length()-1;
		while(l<=r) {
			if(Character.isLetterOrDigit(s.charAt(l)) && Character.isLetterOrDigit(s.charAt(r))) {
				if(s.charAt(l) != s.charAt(r))
					return false;
				l++;
				r--;
			}
			else if(!Character.isLetterOrDigit(s.charAt(l)))
				l++;
			else if(!Character.isLetterOrDigit(s.charAt(l)))
				r--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		ValidPalindromeSolution solution = new ValidPalindromeSolution();
		System.out.println("Es valido? "+ 
		solution.isPalindrome("0P"));
	}
}

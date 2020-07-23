
public class PalindromeNumberSolution {
	public boolean isPalindrome(int x) {
		String number = Integer.toString(x);
		int l= 0;
		int r= number.length()-1;
		while(r >= l ) {
			if(number.charAt(l) != number.charAt(r))
				return false;
			l++;
			r--;
		}
       return true;		
    }
	
	 public boolean IsPalindromeSolution(int x) {
	        // Special cases:
	        // As discussed above, when x < 0, x is not a palindrome.
	        // Also if the last digit of the number is 0, in order to be a palindrome,
	        // the first digit of the number also needs to be 0.
	        // Only 0 satisfy this property.
	        if(x < 0 || (x % 10 == 0 && x != 0)) {
	            return false;
	        }

	        int revertedNumber = 0;
	        while(x > revertedNumber) {
	            revertedNumber = revertedNumber * 10 + x % 10;
	            x /= 10;
	        }

	        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
	        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
	        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
	        return x == revertedNumber || x == revertedNumber/10;
	    }
	
	public static void main(String[] args) {
		PalindromeNumberSolution solution = new PalindromeNumberSolution();
		System.out.println("Hola k " + solution.isPalindrome(10));
	}
}

public class ReverseStringSolution {
	public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        while(r>=l) {
        	char tmp = s[l];
        	s[l]= s[r];
        	s[r] = tmp;
        	l++;
        	r--;        		
        }
    }
	
	public static void main(String[] args) {
		ReverseStringSolution solution = new ReverseStringSolution();
		char[] s = {'h','e','l','l','o'};
		solution.reverseString(s);
		System.out.println("El reves es "+ String.valueOf(s));
	}		
}

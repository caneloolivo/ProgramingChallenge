public class SplitStringBalancedStringsSolution {
	public int balancedStringSplit(String s) {
        int count = 0;
        int L = 0, R = 0;
        for(char c: s.toCharArray()) {
        	if(c == 'R')
        		R++;
        	else
        		L++;
        	if(L == R) {
        		count ++;
        		L = 0;
        		R = 0;
        	}
        }
        return count;
    }
	
	public int balancedStringSplit2(String s) {
		int count = 0;        
        int l = 0;
        int r = 0;
        for(int i = 0; i < s.length(); i ++){
        	if(s.charAt(i) == 'L')
        		l++;
        	else
        		r++;
        	if(l== r) {
        		count++;
        		r =0;
        		l= 0;
        	}
        	
        }
        return count;
	}
}

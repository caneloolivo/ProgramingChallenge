import java.util.HashMap;

public class DecryptStringAlphabetIntegerMappingSolution {
	public String freqAlphabets(String s) {
		int aValue = 'a' -1;
		StringBuilder result = new StringBuilder();
		for(int i = s.length() -1; i >= 0 ; i--) {			
			int ascii = 0;
			if(s.charAt(i) == '#') {
				String sub = s.substring(i-2, i);
				ascii = Integer.parseInt(sub) + aValue;
				i-=2;
			}
			else {
				ascii =s.charAt(i)-'0' + aValue;
			}
			result.append((char)ascii);
		}
		
		return result.reverse().toString();
    }
	
	public static void main(String[] args) {
		DecryptStringAlphabetIntegerMappingSolution solution = new DecryptStringAlphabetIntegerMappingSolution();
		String s = "10#11#12";
		String result = solution.freqAlphabets(s);
		System.out.println("El String es " + result);
	}
}


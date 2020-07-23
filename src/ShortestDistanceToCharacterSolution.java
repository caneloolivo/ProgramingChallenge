import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceToCharacterSolution {
	public int[] shortestToChar(String S, char C) {
		int[] result = new int[S.length()];
        List<Integer> positionE = new ArrayList<Integer>();
        for(int x = 0; x < S.length(); x++ ) {        	
        	if(S.charAt(x) == C) 
        		positionE.add(x);
        } 
        int pos = 0;
        for(int x = 0; x < S.length(); x++ ) {        	
        	if(positionE.size()>1) {
        		int tmp = Math.abs(positionE.get(pos) - x);
        		result[x] = Math.min(tmp, Math.abs(positionE.get(pos+1)-x));        	
        		if(x == positionE.get(pos)) {
        			if(pos < positionE.size()-2)
        				pos++;
        		}
        	}
        	else
        		result[x] = Math.abs(positionE.get(pos) - x);
        } 
        return result;      
    }
	
	public int[] shortToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int prev = -1;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == c) 
            	prev = i;
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE/s.length();
        for (int i = s.length()-1; i >= 0; --i) {
            if (s.charAt(i) == c) 
            	prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
	}
	
	public static void main(String[] args) {
		ShortestDistanceToCharacterSolution solution = new ShortestDistanceToCharacterSolution();

		int[] result = solution.shortToChar("cizokxcijwbyspcfcqws", 'c');
		for(int res: result) {
			System.out.print(res+ " ");
		}
	}
}

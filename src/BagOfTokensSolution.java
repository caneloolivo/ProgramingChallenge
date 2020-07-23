import java.util.Arrays;

public class BagOfTokensSolution {
	public int bagOfTokensScore(int[] tokens, int P) {
		int result = 0, points = 0 ;
		int lo = 0, hi = tokens.length -1;
		Arrays.parallelSort(tokens);
		while(lo <= hi && (P >= tokens[lo] || points > 0)) {
			while(lo <= hi && P >= tokens[lo]) {
				P -= tokens[lo++];
				points++;
			}    	 
			result = Math.max(result, points);
			if(lo <= hi && points > 0 ) {
				P += tokens[hi--];
				points--;
			}
		}     
		return result;
    }
	
	public static void main(String[] args) {
		BagOfTokensSolution solution = new BagOfTokensSolution();
		int [] tokens = {100, 200};
		int P = 150;
		int result = solution.bagOfTokensScore(tokens, P);
		System.out.println("El resultado es " + result);
	}
}

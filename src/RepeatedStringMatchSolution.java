public class RepeatedStringMatchSolution {
	public int repeatedStringMatch(String A, String B) {
		int times = 0;
		while(A.length() <= B.length()*2){
			if(A.indexOf(B) == -1)
				times ++;
			else
				return times + 1;
			A += A;
		}
		return -1;
    }
	
	private boolean isSubString() {
		return false;
	}
	
	public static void main (String[] args) {
		RepeatedStringMatchSolution 
		solution = new RepeatedStringMatchSolution();
		
		int result = solution.repeatedStringMatch("abc", "cabcabca");
		System.out.println("Se necesita "+ result);
	}
}

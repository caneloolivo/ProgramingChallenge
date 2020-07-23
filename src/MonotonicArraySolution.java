public class MonotonicArraySolution {
	public boolean isMonotonic(int[] A) {
		boolean isAscending = false;
		if(A[0] < A[A.length-1])
			isAscending = true;
		for(int x = 1; x<A.length -1; x++) {
			if(isAscending) {
				if(A[x] > A[x+1])
					return false;
			}
			else
				if(A[x] < A[x+1])
					return false;
		}
       return true;
    }
	
	public static void main(String[] args) {
		MonotonicArraySolution solution = new MonotonicArraySolution();
		int[] nums = {1,1,0};
		boolean result = solution.isMonotonic(nums);
		System.out.println("Es monotono " + result);
	}
}

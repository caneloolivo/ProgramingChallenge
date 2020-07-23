
public class SearchMatrixSolution {
	public boolean searchMatrix(int[][] matrix, int target) {
       boolean isInMatrix = false;
       for(int [] row: matrix) {
    	   if(row.length >0 ) {
    		   if(row[row.length-1] >= target)
    			   return binarySearch(row, target, 0, row.length-1);
    	   }
       }
       return isInMatrix;
    }
	
	public boolean binarySearch(int[] row, int target, int l, int r) {
		while(r >= l) {
			int m = l+(r-l)/2;
			if(row[m] == target)
				return true;
			if(row[m] > target)
				return binarySearch(row, target, l, m-1);
			
			return binarySearch(row, target, m+1, r);
		}
		return false;
	}
	
	public static void main(String[] args) {
		SearchMatrixSolution solution = new SearchMatrixSolution();
		int [][] matrix ={{1}};
		boolean isInMarix =solution.searchMatrix(matrix, 1);
		System.out.println("La encuesta nos dice: " + isInMarix);
	}
}


public class SearchA2DMatrixIISolution {
	public boolean searchMatrix(int[][] matrix, int target) {
		for(int[] row: matrix) {
			if(row.length > 0) {
				boolean result = binarySearch(row, target, 0, row.length-1);
				if(result)
					return true;
			}
		}
		return false;
    }
	
	public boolean binarySearch(int[] row, int target, int l, int r) {
		while(r>=l) {
			int m= l+(r-l)/2;
			if(row[m]==target)
				return true;
			if(row[m] > target )
				return binarySearch(row, target, l, m-1);
			return binarySearch(row, target, m+1, r);
		}
		return false;
	}
	public static void main(String[] args) {
		SearchA2DMatrixIISolution solution = new SearchA2DMatrixIISolution();
//		int [][] matrix = {
//		                   {1,   4,  7, 11, 15},
//		                   {2,   5,  8, 12, 19},
//		                   {3,   6,  9, 16, 22},
//		                   {10, 13, 14, 17, 24},
//		                   {18, 21, 23, 26, 30}};
		
		int [][] matrix={{-5}};
		boolean result = solution.searchMatrix(matrix, -5);
		System.out.print("Me la pelas: " + result);
	}
}

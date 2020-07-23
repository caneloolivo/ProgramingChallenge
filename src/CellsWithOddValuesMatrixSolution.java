
public class CellsWithOddValuesMatrixSolution {
	public int oddCells(int n, int m, int[][] indices) {
		int result = 0;
		int[][] matrix = new int[n][m];
		for(int i = 0 ; i< indices.length; i++) {
			fillRow(indices[i][0], matrix);
			fillColumn(indices[i][1], matrix);
		}
		for(int[] row: matrix) {
			for(int num: row) {
				if(num % 2 != 0)
					result++;
			}
		}
        return result;		
    }
	public void fillRow(int row, int[][] matrix) {
		for(int j = 0; j< matrix[row].length; j++ )
			matrix[row][j]++;
	}
	public void fillColumn(int column, int[][] matrix) {
		for(int i = 0; i < matrix.length; i++)
			matrix[i][column]++;
	}
}

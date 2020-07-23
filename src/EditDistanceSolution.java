
public class EditDistanceSolution {
	public int minDistance(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();
        int[][] result = new int[m + 1][n +1];
        for(int i = 0; i <= m; i ++)
        	result[i][0] = i;
        
        for (int i = 0; i <= n; i ++)
        	result[0][i] = i;
        
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j< n; j++) {
        		if(word1.charAt(i) == word2.charAt(j))
        			result[i +1][j +1] = result[i][j];
        		else {
        			int a = result[i][j];
        			int b = result[i][j +1];
        			int c = result[i+1][j];
        			result[i+1][j+1] = Math.min(a, Math.min(b, c));
        			result[i+1][j+1] ++;
        		}
        	}
        }        
        return result[m][n];
    }
	
	public static void main(String args[]) {
		
	}
}

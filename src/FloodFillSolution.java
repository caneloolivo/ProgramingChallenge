
public class FloodFillSolution {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];
		if(color != newColor)
			dfs(image, sr, sc, color, newColor);
		return image;
    }
	
	public void dfs(int[][] image, int r, int c, int color, int newColor) {		
		if(image[r][c] == color) {
			image[r][c] = newColor;
			if(r >= 1) 
				dfs(image, r-1, c, color, newColor);
			if(c >= 1)
				dfs(image, r, c-1, color, newColor);
			if(r < image.length -1)
				dfs(image, r+1, c, color, newColor);
			if(c <image[0].length-1)
				dfs(image, r, c+1, color, newColor);
		}		
	}
	
	public static void main(String[] args) {
		FloodFillSolution solution = new FloodFillSolution();
		int [][]image = {{1,1,1},{1,1,0},{1,0,1}};
		int newColor = 2;
		int[][] result = solution.floodFill(image, 1, 1, newColor);
		for(int[] row: result) {
			for(int num: row)
				System.out.print(num +" ");
			System.out.println("");
		}
	}
}

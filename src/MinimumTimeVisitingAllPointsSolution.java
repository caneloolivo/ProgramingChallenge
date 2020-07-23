
public class MinimumTimeVisitingAllPointsSolution {
	public int minTimeToVisitAllPoints(int[][] points) {
		int result = 0;
		for(int i = 0; i< points.length-1; i++) {
			int xMov = Math.abs(points[i][0] - points[i+1][0]);
			int yMov = Math.abs(points[i][1] - points[i+1][1]);
			result += Math.max(xMov, yMov);
		}
		return result;
    }
	
}


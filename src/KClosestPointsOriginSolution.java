import java.util.Arrays;

public class KClosestPointsOriginSolution {
	public int[][] kClosest(int[][] points, int K) {
		int [][] result = new int[K][2];
		int n = points.length;
		int [] distance = new int[n];
		for(int i = 0; i < n; i ++)
			distance[i] = dist(points[i]);
		Arrays.parallelSort(distance);
		int position = 0;
		int distK = distance[K-1];
		for(int i = 0 ; i< n ; i ++) {
			if(dist(points[i]) <= distK)
			result[position++] = points[i];
		}
			
        return result;
    }
	
	public int dist(int[] point) {
		return point[0] * point[0] + point[1] * point[1];
	}
	
	
	public static void main(String[] args) {
		KClosestPointsOriginSolution solution = new KClosestPointsOriginSolution();
		int[][] points = {{3,3},{5,-1},{-2,4}};
		int K = 2;
		int[][] result = solution.kClosest(points, K);
		for(int i[] : result)
			System.out.println("Este es un punto de los más cercanos " + i[0] + "," + i[1]);
	}
}

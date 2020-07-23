import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartiteSolution {
	public boolean isBipartite(int[][] graph) {
		int n = graph.length;
		int[] color = new int[n];
		Arrays.fill(color, -1);
		for (int i = 0; i < n; i++)
			if ((color[i] == -1) && !bfs(i, graph, color))
				return false;
		return true;
	}

	private boolean bfs(int node, int[][] graph, int[] color) {
		Queue<Integer> q = new LinkedList<>();
		q.add(node);
		color[node] = 0;
		while (!q.isEmpty()) {
			int curr = q.poll();
			for (int count : graph[curr]) {
				if (color[count] == color[curr])
					return false;
				if (color[count] == -1) {
					color[count] = 1 - color[curr];
					q.add(count);
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		IsGraphBipartiteSolution solution = new IsGraphBipartiteSolution();
		int[][] graph = {{1,3}, {0,2}, {1,3}, {0,2}};
		boolean result = solution.isBipartite(graph);
		System.out.println("Se puede dividir? "+ result);
	}
}

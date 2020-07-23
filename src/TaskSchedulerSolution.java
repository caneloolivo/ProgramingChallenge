import java.util.Arrays;

public class TaskSchedulerSolution {
	public int leastInterval(char[] tasks, int n) {
		int count = 0;
		int[] chars = new int[26];
		for(char c : tasks)
			chars[c - 'A']++;
		Arrays.parallelSort(chars);
		while(chars[25] > 0) {
			int i = 0;
			while(i<= n) {
				if(chars[25] == 0)
					break;
				if(i < 26 && chars[25 - i] > 0)
					chars[25-i]--;
				count++;
				i++;
			}
			Arrays.parallelSort(chars);
		}
       return count;
    }
	
	public static void main(String[] args) {
		TaskSchedulerSolution solution = new TaskSchedulerSolution();
		char[] tasks = {'A','A','A','B','B','B'} ;
		int n = 2;
		int result = solution.leastInterval(tasks, n);
		System.out.println("El resultado fue " + result);
	}
}

public class DistributeCandiesSolution {
	public int[] distributeCandies(int candies, int num_people) {
		int[] solution = new int[num_people];
		int x = 1;
		int i = 0;
		while (candies > -1) {
			if(candies > x)
				solution[i] += x;
			else
				solution[i] += candies;
			if(i == num_people-1)
				i = 0;
			else
				i++;
			candies = candies - x;
			x++;			
		}
		return solution;
    }
	
	public static void main(String[] args) {
		DistributeCandiesSolution candies = new DistributeCandiesSolution();
		int[] solution = candies.distributeCandies(10, 3);
		System.out.println("Este es");
		for(int i : solution )
			System.out.print(i);
	}
}

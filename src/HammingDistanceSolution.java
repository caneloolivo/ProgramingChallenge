public class HammingDistanceSolution {
	public int hammingDistance(int x, int y) {
		int hamming = 0;
		while(x>= 0|| y>=0) {
			if(x%2 != y%2)
				hamming++;
			x= x/2;
			y= y/2;
			if(x == 0 && y == 0) break;
		}		
		return hamming;
    }
	
	public static void main(String[] args) {
		HammingDistanceSolution solution = new HammingDistanceSolution();
		int result = solution.hammingDistance(1, 4);
		System.out.println("La distancia es "+ result);
	}
}

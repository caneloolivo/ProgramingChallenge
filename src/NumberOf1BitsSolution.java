public class NumberOf1BitsSolution {
	public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
	
	public static void main(String[] args) {
		NumberOf1BitsSolution solution = new NumberOf1BitsSolution();
		int n = 00000000000000000000000000001011;
		int result = solution.hammingWeight(n);
		System.out.println("El resultado es " + result);
	}
}

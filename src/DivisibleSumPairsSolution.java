
public class DivisibleSumPairsSolution {
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		for(int x=0; x < ar.length; x++) {
			for(int y=x+1; y < ar.length; y++) {
				if(ar[x] +ar[y]  == k || (ar[x] +ar[y]) % k == 0)
					count++;
			}
		}
		return count;
    }

	public static void main(String[] args) {
		int [] ar = {1,3,2,6,1,2};
		int result = divisibleSumPairs(6, 3, ar);
		System.out.print(result);
	}
}

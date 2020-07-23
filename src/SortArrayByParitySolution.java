
public class SortArrayByParitySolution {
	public int[] sortArrayByParity(int[] A) {
		int x = 0;
		int y = A.length-1;
		while(x<=y) {
			if(A[x] % 2 > A[y] %2) {
				int tmp = A[x];
				A[x] = A[y];
				A[y]= tmp;				
			}
			if(A[x]%2 ==0 )x++;
			if(A[y]%2 ==1 )y--;
		}
		return A;
    }
	
	public static void main(String[] args) {
		SortArrayByParitySolution solution = 
				new SortArrayByParitySolution();
		int A[] = {3,1,2,4};
		int [] result = solution.sortArrayByParity(A);
		for(int r: result)
			System.out.print(r);
 	}
}

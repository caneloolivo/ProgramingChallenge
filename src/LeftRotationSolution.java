
public class LeftRotationSolution {
	static int[] rotLeft(int[] a, int d) {
		int i, j, k, temp; 
		int g_c_d = gcd(d, a.length); 
		for (i = 0; i < g_c_d; i++) { 
			/* move i-th values of blocks */
			temp = a[i]; 
			j = i; 
			while (true) { 
				k = j + d; 
				if (k >= a.length) 
					k = k - a.length; 
				if (k == i) 
					break; 
				a[j] = a[k]; 
				j = k; 
			} 
			a[j] = temp; 
		} 
		return a;
    }
	static int gcd(int a, int b) 
	{ 
		if (b == 0) 
			return a; 
		else
			return gcd(b, a % b); 
	} 
	
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = rotLeft(a, 4);
		for(int value: b)
			System.out.print(value);
	}
}

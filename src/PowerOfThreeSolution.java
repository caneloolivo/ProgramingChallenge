
public class PowerOfThreeSolution {
	
	public boolean isPowerOfThree(int n) {
		if(n<3)
			return false;
		while(n % 3 ==0) {
			n/=3;			
		}
		return n==1;
    }
	
	public static void main(String[] args) {
		PowerOfThreeSolution solution = new PowerOfThreeSolution();
		System.out.println("Vergas" + solution.isPowerOfThree(45));		
	}
}

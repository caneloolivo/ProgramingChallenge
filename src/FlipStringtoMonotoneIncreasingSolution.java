
public class FlipStringtoMonotoneIncreasingSolution {
	public int minFlipsMonoIncr(String S) {
        int count = 0;
        char[] binaryNumber = S.toCharArray();
        for(int x = S.length()-1; x>= 1; x--) { 
        	if(binaryNumber[x] < binaryNumber[x-1]) {
        		binaryNumber[x] = '1';
        		count++;
        	}
        }
        return count;
    }
	
	public static void main(String[] args) {
		FlipStringtoMonotoneIncreasingSolution solution = new FlipStringtoMonotoneIncreasingSolution();
		int result = solution.minFlipsMonoIncr("00011000");
		System.out.println("el resultado es "+ result);
	}
}

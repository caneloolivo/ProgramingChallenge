

public class EvenNumber {
	public static int findNumbers(int[] nums) {
		int count = 0;
		for(int x = 0; x< nums.length; x++) {
			String tmp = new StringBuffer().append(nums[x]).toString();
			if(tmp.length() % 2==0)
				count++;
		}
		return count;    
    }
	
	public static void main (String [] args) {
		int numbers[] = {555,901,482,1771};
		int result = findNumbers(numbers);
		System.out.println(result);
	}
}

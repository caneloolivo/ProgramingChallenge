import java.util.Arrays;

public class SingleNumberIISolurion {
	public int singleNumber(int[] nums) {
		int x = 0;
		Arrays.sort(nums);
		while(x < nums.length) {
			if(x==nums.length-1)
				return nums[x];
			if (nums[x] != nums[x+2])
				return nums[x];
			x+= 3;
		}
		return 0;
    }
	
	public static void main(String[] args) {
		SingleNumberIISolurion solution = new SingleNumberIISolurion();
		int[] nums= {0,1,0,1,0,1,99};
		int result = solution.singleNumber(nums);
		System.out.println("El número es: "+ result);
	}
}

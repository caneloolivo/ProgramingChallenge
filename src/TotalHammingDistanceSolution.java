
public class TotalHammingDistanceSolution {
	public int totalHammingDistance(int[] nums) {
        int hamingDistance = 0;
        for(int x = 0; x<nums.length-1;x++) {
        	int num1 = nums[x];
        	for(int y= x+1; y< nums.length; y++) {
        		int num2 = nums[y];
        		hamingDistance = hamingDistance + HammingDistance(num1, num2);        		
        	}
        }
        return hamingDistance;
    }
	
	private int HammingDistance(int num1, int num2) {
		int hammingDistance = 0;
		while(num1!= 0 || num2!=0) {
			if(num1 % 2 != num2 %2)
				hammingDistance ++;
			num1 = num1/2;
			num2 = num2/2;
		}
		return hammingDistance;
	}
	
	public int totalHammingDistance2(int[] nums) {
        if(nums==null || nums.length==0) 
        	return 0;
        int total=0;
        int len=nums.length;
        for(int j=0;j<32;j++){
            int count=0;
            for(int num:nums) 
            	count+=(num>>j)&1;
            total+=count*(len-count);
        }
        return total;
	}
	
	public static void main(String[] args) {
		TotalHammingDistanceSolution solution = new TotalHammingDistanceSolution();
		int[] nums = {4, 14, 2};
		int result = solution.totalHammingDistance2(nums);
		System.out.println("El resultado fue " + result);		
	}
}

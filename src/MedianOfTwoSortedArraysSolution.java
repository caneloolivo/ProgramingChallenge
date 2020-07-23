
public class MedianOfTwoSortedArraysSolution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
        double sum1 = 0;
        double sum2 = 0;
        for(int num : nums1) {
        	sum1 += num;
        }
        for(int num : nums2) {
        	sum2 += num;
        }
        
        if(sum1 == 0 && sum2 == 0)
        	return 0.0;
        
        if(sum1 == 0 && sum2 != 0  )
        	return sum2 / nums2.length;
        
        if(sum2 == 0 && sum1 != 0)
        	return sum1 / nums1.length;
        
        sum1 = sum1 / nums1.length;
        sum2 = sum2 / nums2.length;
        return (sum1 + sum2) / 2;
    }
	
	public static void main(String[] args) {
		MedianOfTwoSortedArraysSolution solution 
		= new MedianOfTwoSortedArraysSolution();
		int [] nums1 = {3};
		int [] nums2 = {-2,-1};
		System.out.println("La media es: " 
		+ solution.findMedianSortedArrays(nums1, nums2));
	}
}

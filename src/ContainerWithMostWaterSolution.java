
public class ContainerWithMostWaterSolution {
	public int maxArea(int[] height) {
        int maxContainer = 0;
        int n = height.length;
        for(int i = 0; i < n-1; i++) {
        	for(int j = i+1; j < n; j++) {
        		int tmpContainer = Math.min(height[i], height[j]) * (j - i);
        		maxContainer = Math.max(tmpContainer, maxContainer);
        	}
        }        
        return maxContainer;
    }
	
	public int maxArea2(int[] height) {
        int maxContainer = 0;
        int  l = 0  ,r = height.length -1;
        while( l < r) {
        	int tmpContainer = Math.min(height[l], height[r]) * (r - l);
        	maxContainer = Math.max(tmpContainer, maxContainer);
        	if(height[l] > height[r]) {
        		r--;
        	}
        	else {
        		l++;
        	}
        }        
        return maxContainer;
    }
	public static void main(String[] args) {
		ContainerWithMostWaterSolution solution = new ContainerWithMostWaterSolution();
		int [] height = {1,8,6,2,5,4,8,3,7};
		int result = solution.maxArea2(height);
		System.out.println("El resultado " + result);
	}
}

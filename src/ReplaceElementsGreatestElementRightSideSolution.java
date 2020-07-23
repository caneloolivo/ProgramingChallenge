
public class ReplaceElementsGreatestElementRightSideSolution {
	public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int maxValue = -1;
        for(int x = arr.length-1; x >=0; x--) {
        	result[x] = maxValue;
        	maxValue = Math.max(arr[x], maxValue);
        }
        return result;
    }
	
	public static void main(String[] args) {
		ReplaceElementsGreatestElementRightSideSolution solution = 
				new ReplaceElementsGreatestElementRightSideSolution();
		int[] arr = {17,18,5,4,6,1};
		int[] result = solution.replaceElements(arr);
		for(int num: result)
			System.out.print(num + " ");
	}
}

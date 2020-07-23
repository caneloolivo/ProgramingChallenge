import java.util.HashMap;

public class InterviewTito {		
	
	public String addSum(String num1, String num2) {
		String result = "";
		if(num1.length() > num2.length()) {
			
		}
		else if(num2.length() > num1.length()) {
			
		}
		else if(num2.length() == num1.length()) {
			boolean isBiggerThan10= false;
			for(int x = num1.length() -1; x >= 0 ; x--) {				
				if(!isBiggerThan10) {
					if((num1.charAt(x)-'0')+ (num2.charAt(x) -'0') > 9) {
						isBiggerThan10 = true;
						String tmp = "" + (num1.charAt(x)-'0')+ (num2.charAt(x) -'0');
						result += tmp.charAt(tmp.length()-1);
					}
					else {
						result += (num1.charAt(x)-'0')+ (num2.charAt(x) -'0');
					}
				}
				else {
					isBiggerThan10 = false;
					if((num1.charAt(x)-'0')+ (num2.charAt(x) -'0') + 1 > 9) {
						isBiggerThan10 = true;						
						String tmp = "" + (num1.charAt(x)-'0')+ (num2.charAt(x) -'0') +1;
						result += tmp.charAt(tmp.length()-1);
					}
					else {
						result += (num1.charAt(x)-'0')+ (num2.charAt(x) -'0') + 1;
					}
				}
			}
		}
		return result;
	}
	
	public int profits(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int purchaseDay = 0;
		int maxPrice = 0;
		int sellDay = 0; 
		for(int x = 0; x< prices.length; x++) {
			if(prices[x] < minPrice) {
				purchaseDay = x + 1;
				minPrice = prices[x];
				maxPrice = 0;
			}
			else if(prices[x] > maxPrice) {
				sellDay= x +1;
				maxPrice = prices[x];
			}
		}
		if(purchaseDay > sellDay)
			return 0;		
		return maxPrice - minPrice;
				
	}
	
	public int metodoTito(int[] prices) {
		int profit = 0; 
		int minPrice = Integer.MIN_VALUE; 
		for(int i = 0; i < prices.length; i++){ 
			if(prices[i] - minPrice < 0){ 
				minPrice = prices[i]; 
			}
			else if(prices[i] - minPrice > profit){ 
				profit = prices[i] - minPrice; 
				} 
			} 
		return profit; 
	}
	
	
	
	public static void main(String[] args) {
		
	}
}


public class BestTimeToBuyAndSellStockIISolution {
	public int maxProfit(int[] prices) {
        int profit = 0;
        for(int x = 1; x< prices.length; x++) {
        	if(prices[x] - prices[x-1] >0 )
        		profit += prices[x]- prices[x-1];
        }
        return profit;        
    }
	
	public int maxProfit2(int[] prices) {
		int profit = 0;
		for(int i = 1; i < prices.length; i++) {
			if(prices[i] - prices[i -1] > 0)
				profit += prices[i] - prices[i -1];
		}
		return profit;
	}
	
	public static void main(String[] args) {
		BestTimeToBuyAndSellStockIISolution solution = new BestTimeToBuyAndSellStockIISolution();
		int[] prices = {7,1,5,3,6,4};
		//int[] prices = {1,2,3,4,5};
		int result = solution.maxProfit2(prices);
		System.out.println("El maximo profit es: "+ result);
	}
}

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrderSolution {
	public int[] deckRevealedIncreasing(int[] deck) {
        int[] result = new int[deck.length];
        Arrays.sort(deck);
        Queue<Integer> newDeckOrder = new LinkedList<Integer>();
        for(int x = 0; x< deck.length; x++) {
        	newDeckOrder.add(x);
        }
        int x = 0;
        while(!newDeckOrder.isEmpty()) {
        	result[newDeckOrder.remove()] = deck[x];
        	if(!newDeckOrder.isEmpty())
        		newDeckOrder.add(newDeckOrder.remove());
        	x++;
        }
        return result;        
    }
	
	public static void main(String[] args) {
		RevealCardsInIncreasingOrderSolution solution = new RevealCardsInIncreasingOrderSolution();
		int[] deck = {17,13,11,2,3,5,7};
		int[] result = solution.deckRevealedIncreasing(deck);
		for(int x: result)
			System.out.print(x +" ");
		     
	}
}

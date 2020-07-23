
public class DesignStackWithIncrementOperationSolution {
	static class CustomStack {
		
		private int[] customStack;
		private int position;
		
	    public CustomStack(int maxSize) {
	        customStack = new int[maxSize];
	        position = 0;
	    }
	    
	    public void push(int x) {
	        if(position < customStack.length ) {
	        	customStack[position] = x;
	        	position++;
	        }
	    }
	    
	    public int pop() {
	    	int val = -1;
	    	if(position >= 0) {
	    		position--;
	    		val = customStack[position];
	    		customStack[position] = 0;	    		
	    	}
	    	return val;
	    }
	    
	    public void increment(int k, int val) {
	        int i = 0;
	        while(i< Math.min(k, customStack.length)) {
	        	customStack[i++] += val;
	        }
	    }
	}
	
	public static void main(String[] args) {
		CustomStack stack = new CustomStack(3);
		stack.push(1);
		stack.push(2);
		System.out.println("Pop: " + stack.pop());
		stack.push(2);
		stack.push(3);
		stack.push(4);
	}
}

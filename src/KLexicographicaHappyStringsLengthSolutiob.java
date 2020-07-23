import java.util.Stack;

public class KLexicographicaHappyStringsLengthSolutiob {
	public String getHappyString(int n, int k) {
		 int pov=(int)Math.pow(2,n-1);
	        if(pov*3<k) return "";
	        
	        char[][] toolMat=new char[][]{{'b','c'},{'a','c'},{'a','b'}};
	        Stack<Integer> stack=new Stack<>();
	        StringBuilder sb=new StringBuilder();
	        
	        for(int i=1;i<n;i++){
	            stack.add((1+k)%2);
	            k=(k+1)/2;
	        }
	        int pos=(k-1)%3;
	        char bad=(char)('a'+pos);
	        
	        sb.append(bad);
	        while(!stack.isEmpty()){
	            char curr=toolMat[pos][stack.pop()];
	            sb.append(curr);
	            pos=(int)(curr-'a');
	        }
	            
	        
	        
	        return sb.toString();
    }
	
	public static void main(String[] args) {
		KLexicographicaHappyStringsLengthSolutiob solution = new KLexicographicaHappyStringsLengthSolutiob();
		String result = solution.getHappyString(10, 100);
		System.out.println("result "+ result);
	}
}
import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSetsSolution {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
	        int count = 0;
	        int n = a.size();
	        int m = b.size();
	        for(int i = 1;i<101;i++){
	            int k = 0;
	            for(int j = 0;j<n;j++){
	                if(i % a.get(j) == 0){
	                    k++;
	                }
	            }
	            
	            for(int j = 0;j<m;j++){
	                if(b.get(j) % i == 0){
	                    k++;
	                }
	            }
	            
	            if(k == m+n){
	                count++;
	            }
	        }
	        return count;
	    }
	 public static void main(String[] args) {
		 List<Integer> a = new ArrayList<Integer>();
		 a.add(2);
		 a.add(4);		 
		 List<Integer> b = new ArrayList<Integer>();
		 b.add(16);
		 b.add(32);
		 b.add(96);
		 int result = getTotalX(a, b);
		 System.out.println("Resultad" + result);
	 }
}

import java.util.*;

public class EntrevistaCaro {	
	
	 //public int solution(int[] A, int[] B, int N) {
//		 HashMap< Integer, Integer> solution = 
//				 new HashMap<Integer, Integer>();
//		 for(int x = 0; x < N; x++ ) {
//			 if(solution.containsKey(A[x])) {
//				 solution.put(A[x], solution.get(A[x])+1);
//			 }
//			 else {
//				 solution.put(A[x], 1);
//			 }			 
//			 if(solution.containsKey(B[x])) {
//				 solution.put(B[x], solution.get(B[x])+1);
//			 }
//			 else {
//				 solution.put(B[x], 1);
//			 }
//		 }
//		 int result = 0;
//		 for(Map.Entry k: solution.entrySet()) {
//			 if(solution.get(k.getKey())> result)
//				 result = solution.get(k.getKey());
//		 }
//		 return result;
//	 }
	public int maxRoads(int A[],int B[], int N) { 
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		for(int i=0;i<N;i++) { 
			map.putIfAbsent(A[i], 0); 
			map.put(A[i],map.get(A[i])+1); 
			map.putIfAbsent(B[i], 0); 
			map.put(B[i],map.get(B[i])+1); 
		} 
		int max=0; 
		for(int i=0;i<N;i++) { 
			max=Math.max(map.get(A[i]) + map.get(B[i]) -1 ,max);//extra -1 as the road is counted twice 
		} 
		return max; 
	} 
	
	public static void main(String[] args) {
		int[] A= {1,2,3,3}; int[] B= {2,3,1,4};
		EntrevistaCaro solution = new EntrevistaCaro();
		int result = solution.maxRoads(A, B, 4);
		System.out.println("Result " + result);
		
	}
}

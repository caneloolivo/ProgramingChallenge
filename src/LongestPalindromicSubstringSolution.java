import java.util.Arrays;

public class LongestPalindromicSubstringSolution {
	public String longestPalindrome(String s) {
		 if (s == null || s.length() < 1) return "";
		    int start = 0, end = 0;
		    for (int i = 0; i < s.length(); i++) {
		        int len1 = expandAroundCenter(s, i, i);
		        int len2 = expandAroundCenter(s, i, i + 1);
		        int len = Math.max(len1, len2);
		        if (len > end - start) {
		            start = i - (len - 1) / 2;
		            end = i + len / 2;
		        }
		    }
		    return s.substring(start, end + 1);
		}

		private int expandAroundCenter(String s, int left, int right) {
		    int L = left, R = right;
		    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
		        L--;
		        R++;
		    }
		    return R - L - 1;
		}
	public String longestPalindrome2(String s) {
		int length = s.length();
		if(length == 0)
	        return "";
	  
	  int [][]arr=new int[length][length];
	  int big = 0,m = 0,n = 0;
	    
	  for(int j = 0; j < length; j++)
	  {
	     for(int i = 0;i <= j;i++)
	     {   
	             if(i == j)
	             {  
	                arr[i][j] = 1;     	              
	                if(big < arr[i][j])
	                { 
	                	big = arr[i][j];
	                	m = i;
	                	n = j; 
	                 }	                 
	                continue;
	              }
	             
	             if(s.charAt(i) == s.charAt(j) && j-1 == i)
	            	 arr[i][j]=2;
	             
	             else if(s.charAt(i) == s.charAt(j))
	             {
	            	 if(arr[i+1][j-1] >0 )
	            		 arr[i][j] = 2 + arr[i+1][j-1];
	             }
	        
	             if(big < arr[i][j])           	 
	             {
	            	   big = arr[i][j];
	            	   m=i; 
	            	   n=j;
	             }
	      }
	   }      
	   return s.substring(m,n+1); 	
	}		
	
	public static void main(String[] args) {
		LongestPalindromicSubstringSolution solution = 
				new LongestPalindromicSubstringSolution();
		String result = solution.longestPalindrome2("babad");
		System.out.println("Salio: "+ result);
	}
}

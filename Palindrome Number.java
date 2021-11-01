class Solution {
    public boolean isPalindrome(int x) {
        
   

		 String s=Integer.toString(x);
	        char d[]=s.toCharArray();
         if(d.length==1)
    {
        return true;
    }
	        char f[]=new char[d.length];
	            for(int i=d.length-1;i>=0;i--)
	            {
	              f[d.length-i-1]=d[i];  
	            }
	       
	         
	        Boolean g=Arrays.equals(d,f);
	        
	    
	   return g; }
	}

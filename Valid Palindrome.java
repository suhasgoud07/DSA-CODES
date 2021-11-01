class Solution {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]+","");
        
        s=s.toLowerCase();
       char x[]=s.toCharArray();
        int size=x.length;
        
        char y[]=new char[size];
        for(int i=0;i<size;i++)
        {
            y[size-1-i]=x[i];
        }
       for(int i=0;i<size;i++)
        {
           if(x[i]!=y[i]){
         return false;
        }
        else
        {
          continue;
        }
       }  return true;
}
}
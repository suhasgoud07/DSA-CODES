class Solution {
    public String reverseOnlyLetters(String s) {
        char c[]=s.toCharArray();
        char d[]=new char[c.length];
        int l=0;int r=c.length-1;
        while(l<=r)
        {
            if(Character.isLetter(c[l])!=true)
            {
                l++;
            }
            
             if(Character.isLetter(c[r])!=true)
             {
                r--;
             }
            
            
            if(l<=r&& Character.isLetter(c[l])==true && Character.isLetter(c[r])==true)
            {
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
            }
            
        }
        String h= new String(c);
        return h;
        
        
    }
}
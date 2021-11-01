class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String p="";
        for(String a:word1)
        {
           p=p+a; 
        }
        char c[]=p.toCharArray();
        
        String f=new String(c);
        String q="";
        for(String b:word2)
        {
           q=q+b; 
        }
        char d[]=q.toCharArray();
        
        String g=new String(d);
        
        if(f.equals(g))
        {
            return true;
        }
        return false;
        
        
    }
}
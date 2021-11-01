class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()>0 || needle.length()>0)
        {
       if(haystack.contains(needle))
       {
           haystack= haystack.replace(needle ,".");
       }
        char c[]=haystack.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='.')
            {
                return i;
            }
        }
        return -1;
    }
    return 0;
    }
}
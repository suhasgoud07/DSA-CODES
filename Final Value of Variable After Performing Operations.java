class Solution {
    public int finalValueAfterOperations(String[] op) {
       int r=0;
        int n=op.length;
        for(int i=0;i<n;i++)
        {
            if(op[i].equals("++X")||op[i].equals("X++"))
            {
                r=r+1;
            }
            
          else   if(op[i].equals("--X")||op[i].equals("X--"))
            {
                r=r-1;
            }
            
        }
        return r;
    }
}
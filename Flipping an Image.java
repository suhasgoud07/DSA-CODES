class Solution {
    public int[][] flipAndInvertImage(int[][] a) {
        
        
         for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
               if(a[i][j]==0)
               {
                   a[i][j]=1;
               }
                else if(a[i][j]==1)
                {
                    a[i][j]=0;
                }
            
            }
         }
        for(int i=0;i<a.length;i++)
        {
    
               int l=0;
                int r=a[i].length-1;
                while(l<=r)
                {
                int temp=a[i][l];
                    a[i][l]=a[i][r];
                    a[i][r]=temp;
                    l++;
                    r--;
                }
                
            
            }
        
        
       
        return a;
    }
}
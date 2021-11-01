class Solution {
    public int searchInsert(int[] a, int target) {
       int location = 0;
        if(a.length==1)
        {
            location=0;
        }
if(target>a[a.length-1])
{
    location=a.length;
}
 for(int i=0;i<a.length-1;i++)
 {
     if(a[i]<target&&a[i+1]>=target)
     {
         location=i+1;
         
     }
     
 }
        
        
    
    
    return location;
}
}


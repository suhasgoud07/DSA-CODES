class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int csum=0;
        
        for(int i=0;i<nums.length-2;i++)
        {
            int start=i+1;
            int end=nums.length-1;
            while(end>start)
            {
                
                int Tsum=nums[i]+nums[start]+nums[end];
                
                if(Math.abs(Tsum-target)<min)
                {
                    
                    min=Math.abs(Tsum-target);
                    csum=Tsum;
                    
                }
                if(Tsum==target) return Tsum;
                else if(Tsum<target)
                {
                    
                   start++;
                    
                }
                else if(Tsum>target)
                {
                    
                    end--;
                    
                }
                 
            }
             
        }
        
        
        
      return csum;  
        
        
    }
}
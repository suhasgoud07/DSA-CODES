class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int b[]=new int[nums.length];
        int k=0;
        int m=1;
    for(int i =0;i<nums.length;i++)
    {
            if(nums[i]%2==0  )
            {
             b[k]=nums[i]  ;
                k=k+2;
            }
    }
         for(int i =0;i<nums.length;i++)
    {
            if(nums[i]%2!=0 )
            {
             b[m]=nums[i]  ;
                m=m+2;;
            }
    }
        return b;
        
    }
}
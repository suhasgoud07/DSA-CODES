class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target > nums[mid])
            {
                l=mid+1;
            }
            else if(target<nums[mid])
            {
                r=mid-1;
            }
        }return -1;
        
    }
}
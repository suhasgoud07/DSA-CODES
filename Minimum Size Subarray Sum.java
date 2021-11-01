class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;int j=0;int sum=nums[0];
        Integer result=null;
        while(i>=0 && i<nums.length && j>=0 && j<nums.length){
            if(sum==target){
                result= result== null ? j-i+1 : Math.min(result, j-i+1);
                if(j==nums.length-1){
                    break;
                }
                sum+=nums[++j];
            }else if(sum< target){
                if(j==nums.length-1){
                    break;
                }
                sum+=nums[++j];
            }else{
                result= result== null ? j-i+1 : Math.min(result, j-i+1);
                sum-=nums[i++];
            }            
        }
        
        return result==null ? 0 : result;
    }
}
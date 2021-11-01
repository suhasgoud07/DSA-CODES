class Solution {
    public int[] twoSum(int[] num, int target) {
       int result[]=new int[2];
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	
		for(int i=0;i<num.length;i++)  
		{
			if(map.containsKey(target-num[i]))
			{
				result[1]=i+1;
				result[0]=map.get(target-num[i])+1;
		
			}
			else
			{
				map.put(num[i],i);
			}
            
		}return result;
    }
}
class Solution {
    public List<List<Integer>> fourSum(int[] a, int tar) {
        Arrays.sort(a);
List<List<Integer>> set =new ArrayList<>();
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		for(int k=j+1;k<a.length;k++)
		{
			
            List<Integer>list=new ArrayList<>();
			for(int l=k+1;l<a.length;l++)
			{
                int x=a[i]+a[j]+a[k];
			if(a[l]+x==tar)
			{
                

			list.addAll(Arrays.asList(a[i],a[j],a[k],a[l]));
                if(!set.contains(list))
                {
                    set.addAll(Arrays.asList(list)
                               );
                }
               break; 
			}
			}
			
		}
	}
		
}
        return set ;

    }
}
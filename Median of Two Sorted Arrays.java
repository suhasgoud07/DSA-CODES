class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
     // int a[]=new int[] {11,2,5,6,66};
//int b[]=new int[] {7,8,9,10};
int c[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++)
{
	c[i]=a[i];
}

	for(int j=a.length;j<c.length;j++)
	{
		c[j]=b[j-a.length];
		
	}
	
	for(int k=0;k<c.length;k++)
	{
		for(int l=k+1;l<c.length;l++)
		{
			if(c[k]>c[l])
			{
				int temp=c[k];
				c[k]=c[l];
				c[l]=temp;
			}
		}
	}System.out.println(Arrays.toString(c));
	
int o=c.length;
int h=o/2;
if(o%2!=0)
{
	System.out.println(c[h]);
    return c[h];
}
else {
	float y=c[h]; 
	float z=c[h-1];
	float e=(y+z)/2;
	return e;
}

	 }

}
 

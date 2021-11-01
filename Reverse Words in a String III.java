class Solution {
    public String reverseWords(String s) {
       String g[]=s.split(" ");
        for(int i=0;i<g.length;i++)
        {
            String x="";
            for(int j=g[i].length()-1;j>=0;j--)
            {
                x=x+g[i].charAt(j);
            
            }
            g[i]=x;
        }
        System.out.println(Arrays.toString(g));
        String r="";
    for(int i=0;i<g.length;i++)
    {
        if(i<=g.length-2)
        {
        r=r+g[i]+" ";
        }
        else if(i==g.length-1)
        {
            r=r+g[i];
        }
        
    }
        return r;
    }
}
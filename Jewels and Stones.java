class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       char c[]=jewels.toCharArray();
        char d[]=stones.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<d.length;j++)
            {
            if(c[i]==d[j])
            {
                count++;
            }
        }
    }return count;
}
}
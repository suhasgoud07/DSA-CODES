class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       String a="abcdefghijklmnopqrstuvwxyz";
        char c[]=a.toCharArray();
        String d[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        Map<Character,String>map=new LinkedHashMap<>();
        for(int i=0;i<c.length;i++)
        {
            map.put(c[i],d[i]);
        }
        
for(int i=0;i<words.length;i++)
{
    char g[]=words[i].toCharArray();
 String x="";
    for(int j=0;j<g.length;j++)
    {   
        if(map.containsKey(g[j]))
        {
            x=x+map.get(g[j]);
        }
    }
    set.add(x);
    
    
}
        return set.size();
    }
}
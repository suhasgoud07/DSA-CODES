class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      Set<Character>set=new HashSet<>();
        char c[]=allowed.toCharArray();
        int result =0;
        for(int i=0;i<c.length;i++)
        {
          set.add(c[i]);  
        }
        for(int i=0;i<words.length;i++)
        {
            int count=0;
           for(int j=0;j<words[i].length();j++)
           {
               if(set.contains(words[i].charAt(j)))
               {
                   count++;
               }
             
             }
            if(words[i].length()==count)
            {
                result++;
            }
        
    }
return result;}
}
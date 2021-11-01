class Solution {
    public boolean isAnagram(String s, String t) {
        char x[]=s.toCharArray();
        //int size=x.length;
        char y[]=t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
      
        return   Arrays.equals(x,y);
    }
}
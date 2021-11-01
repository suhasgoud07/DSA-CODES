class Solution {
    public boolean repeatedSubstringPattern(String s) {
   
		for(int i=1; i<s.length(); i++){
			String str = s.substring(0, i);
			
			if(s.length() % str.length() != 0) continue; // if 9%2 != 0 then we may not have string of equal size
			
			String[] arr = s.split(str);
			//System.out.println(str+"  "+arr.length);
			if(arr.length == 0) return true;
		}
		return false;
	}
}
class Solution {
    public int  lengthOfLastWord(String s) {
       
    s=s.trim();
    String arr[]=s.split(" ");
    int i,c=0;
    for(i=0;i<arr.length;i++){
        if(arr[i]==" ")
        {     c++;
            break;  
        }
    }
    if(c==1)
        return 0;
    else
        return arr[arr.length-1].length();
}}
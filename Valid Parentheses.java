class Solution {
    public boolean isValid(String s) {
         if(s.length()%2!=0)
        {
            return false;
        }
       Stack<Character> d=new Stack();
        char x[]=s.toCharArray();
       
        for(int i=0;i<x.length;i++)
        {
            if(x[i]=='(' || x[i]=='{' || x[i]=='[')
            {
                d.push(x[i]);
            }
            else if(x[i]==')'&& !d.isEmpty() && d.peek()=='(')
            {
               d.pop();
                
                
            } else if(x[i]=='}'&& !d.isEmpty() && d.peek()=='{')
            {
               d.pop();
                
                
            }else if(x[i]==']'&& !d.isEmpty() && d.peek()=='[')
            {
               d.pop();
                
                
            }else 
            {
                return false;
            }
            
            
        }
  return d.isEmpty();
    }
}
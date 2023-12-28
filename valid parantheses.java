//valid parantheses
class Solution {
    public boolean isValid(String s) 
    {
        if(s.length()<2)
            return false;
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='['|| s.charAt(i)=='{')
            {
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}')
            {
                if(stk.isEmpty() || stk.peek()!='{')
                    return false;
                else
                    stk.pop();
            }
            else if(s.charAt(i)==']')
            {
                if(stk.isEmpty() || stk.peek()!='[')
                    return false;
                else
                    stk.pop();
            }
            else if(s.charAt(i)==')')
            {
                if(stk.isEmpty() || stk.peek()!='(')
                    return false;
                else
                    stk.pop();
            }
            else
                return false;
        }
        if(!stk.isEmpty())
            return false;    
        return true;
    }
}
class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        int n=tokens.length;
        int op1;
        int op2;
        int ans=0;
        Stack <Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
                if(tokens[i].equals("*")||tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("/"))
                {
                    op2=st.pop();
                    op1=st.pop();
                    if(tokens[i].equals("*"))
                    {
                        ans=op1*op2;
                        st.push(ans);
                    }
                    else if(tokens[i].equals("/"))
                    {
                        ans=op1/op2;
                        st.push(ans);
                    }
                    else if(tokens[i].equals("+"))
                    {
                        ans=op1+op2;
                        st.push(ans);
                    }
                    else
                    {
                        ans=op1-op2;
                        st.push(ans);
                    }
                }
                else
                {
                    int num = Integer.parseInt(tokens[i]);
                    st.push(num);
                }
        }
    return st.pop();
    }
    
}

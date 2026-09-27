class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n=nums.length;
        int[] ans = new int[n];
        Stack <Integer> st =new Stack<>();
        for(int j=0;j<2*n;j++)
        {
            int i=j%n;
            while(!st.isEmpty()&&nums[i]>nums[st.peek()])
            {
                ans[st.pop()]=nums[i];
            }
            if(j<n)
            {
                st.push(i);
            }
        }
            while(!st.isEmpty())
            {
                ans[st.pop()]=-1;
            }
        return ans;
    }
}

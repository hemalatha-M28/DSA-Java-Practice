class Solution {
    public int characterReplacement(String s, int k)
    {
        int n=s.length();
        int[] count=new int[26];
        int left=0;
        int size=0;
        int maxi=0;
        int ans=0;
        for(int right=0;right<n;right++)
        {
           char ch=s.charAt(right);
           count[ch-'A']++;
           size=right-left+1; 
           maxi = Math.max(maxi, count[ch-'A']);
            while((size-maxi)>k)
            {
              count[s.charAt(left)-'A']--; 
              left++; 
              size=right-left+1; 
            }   
        ans = Math.max(ans, right-left+1);       
        }
    return ans;
    }
}

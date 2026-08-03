class Solution 
{
    public List<Integer> findAnagrams(String s, String p) 
    {
        int n=s.length();
        int m=p.length();
        int i,len;
        int left = 0;
        int[] pcount = new int[26];
        int[] scount = new int[26];
        List<Integer> ans = new ArrayList<>();
        for(i=0;i<m;i++)
        {
            char chb =p.charAt(i);
            pcount[chb-'a']++;
        }
        for(int right = 0; right < n; right++)
        {
            char cha=s.charAt(right);
            scount[cha-'a']++;
            while(right-left+1 > p.length())
            {
                char ch = s.charAt(left);
                scount[ch - 'a']--;
                left++;
            }
            if(Arrays.equals(pcount,scount))
            {
            ans.add(left);
            }
        }
        return ans;
    }
}

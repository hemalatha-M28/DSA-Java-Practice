class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    { 
        int n=s.length();
        int k=10;
        int left=0;
        int j=0;
        List<String> ans = new ArrayList<>();
        HashSet <String> set1=new HashSet<>();
        HashSet <String> set2=new HashSet<>();
        if(k>n)
        {
            return ans;
        }
        else
        {
        for(j=0;j<=n-k;j++)
        {
            String sub= s.substring(j, j + k);
            if(set1.contains(sub))
            {
                if(!set2.contains(sub))
                {
                set2.add(sub);
                ans.add(sub);
                }    
            }
            else
            {
                set1.add(sub);
            }    
        }
        }
       return ans; 
    }
}

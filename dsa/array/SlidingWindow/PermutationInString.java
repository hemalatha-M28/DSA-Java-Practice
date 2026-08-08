class Solution {
    public boolean checkInclusion(String s1, String s2)
    {
        int n=s1.length();
        int m=s2.length();
        int size=0;
        int j=0;
        int i=0;
        int[] count1= new int[26];
        int[] count2= new int[26];
        for(i=0;i<n;i++)
        {   
            count1[s1.charAt(i)-'a']++;
        }
        for(j=0;j<m;j++)
        {
            size=j-n+1;
            count2[s2.charAt(j)-'a']++;
            if(size>=0)
            {
                if(Arrays.equals(count1,count2))
                {
                return true;
                }
                count2[s2 .charAt(size)-'a']--;
            }
        }
        return false;
    }
}

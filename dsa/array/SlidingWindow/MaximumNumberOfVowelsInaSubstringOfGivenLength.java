class Solution {
    public int maxVowels(String s, int k) 
    {
        int n=s.length();
        int count=0;
        int maxi=0;
        int left=0;
        for(int i=0;i<k;i++)
        {
            char ch =s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }
        maxi=count;
        for(int j=k;j<n;j++)
        {
            char ch1=s.charAt(j);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
            {
                count++;
            } 
            char ch2=s.charAt(left);
                if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')
                {
                count--;
                }
                left++;
                maxi=Math.max(maxi,count);
        } 
        return maxi;
    }
}

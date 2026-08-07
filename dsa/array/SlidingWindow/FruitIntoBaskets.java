class Solution {
    public int totalFruit(int[] fruits) 
    {
        int n=fruits.length;
        int maxi=0;
        int left=0;
        int c=0;
        int s=0;
        HashMap <Integer,Integer> map =new HashMap<>();
        for(int right=0;right<n;right++)      
        {
            int ch=fruits[right];
            
            map.put(ch,map.getOrDefault(ch,0)+1);
            s=map.size();
            while(s>2)
            {
                c=fruits[left];
                map.put(c, map.get(c)-1);
                if(map.get(c)==0)
                {
                    map.remove(c);
                }
                left++;
                s=map.size();
            }
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi;     
    }
}

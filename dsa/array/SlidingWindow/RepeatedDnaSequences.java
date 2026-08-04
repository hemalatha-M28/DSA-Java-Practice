class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int n=nums.length;
        int j=0;
        int maxi=0;
        int i=0;
        HashMap <Integer,Integer> Map = new HashMap<>();
        for(i=0;i<n;i++)
        {
            if(Map.containsKey(nums[i]))
            {
                j=Map.get(nums[i]);
                
                if(i-j <=k)
                {
                    return true;
                } 
            }    
            Map.put(nums[i],i);
        }
        return false;
    }
}

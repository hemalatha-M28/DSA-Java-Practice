class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> ans = new ArrayList<>();
        int n=nums.length;
        HashSet<Integer> set= new HashSet<>();
        set.add(nums[0]);
        for(int i=1;i<n;i++)
        {
            if(set.contains(nums[i]))
            {
                ans.add(nums[i]);
            }
            set.add(nums[i]);
        }
        return ans;
    }
}

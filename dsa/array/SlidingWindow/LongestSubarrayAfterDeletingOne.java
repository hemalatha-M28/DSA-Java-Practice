class Solution {
    public int longestSubarray(int[] nums) 
    {
        int right=0;
        int left=0;
        int n= nums.length;
        int size=0;
        int count=0;
        int maxi=0;
        for(right=0;right<n;right++)
        {
        if(nums[right]==0)
        {
            count++;
        }
        while(count>1)
        {
            if(nums[left]==0)
            {
            count--;
            }
            left++;
        }
        size=right-left+1;
        maxi=Math.max(maxi,size);
        }
    return maxi-1;  
    }
}
